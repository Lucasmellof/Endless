package com.yuo.endless;

import com.yuo.endless.Blocks.EndlessBlocks;
import com.yuo.endless.Config.Config;
import com.yuo.endless.Container.ContainerTypeRegistry;
import com.yuo.endless.Entity.EntityRegistry;
import com.yuo.endless.Fluid.EndlessFluids;
import com.yuo.endless.Items.EndlessItems;
import com.yuo.endless.NetWork.NetWorkHandler;
import com.yuo.endless.Proxy.ClientProxy;
import com.yuo.endless.Proxy.CommonProxy;
import com.yuo.endless.Proxy.IProxy;
import com.yuo.endless.Recipe.ModRecipeManager;
import com.yuo.endless.Recipe.RecipeTypeRegistry;
import com.yuo.endless.Sound.ModSounds;
import com.yuo.endless.Tiles.TileTypeRegistry;
import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IDispenseItemBehavior;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("endless")
public class Endless {
	public static final String MOD_ID = "endless";
    public static boolean isBOT = false; //植物魔法
    public static boolean isIAF = false; //冰与火之歌
    public static boolean isCreate = false; //机械动力
    public static boolean isTC3 = false; //匠魂3
    public static boolean isThermal = false; //热力基本
    public static boolean isDE = false; //龙之进化
    public static boolean isMysticalAgriculture = false; //神秘农业
    public static boolean isRS = false; //精致存储
    public static boolean isExtremeReactors = false; //精致存储
    public static boolean isMekanism = false; //精致存储
    public static boolean isChaos = false;
    public static boolean isRoost = false;
    public static boolean isAllOres = false;

    public static final IProxy proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
	public Endless() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SERVER_CONFIG); //配置文件
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        checkMods();
        if (isIAF){
            EndlessItems.registerIafItem();
        }
        if (isCreate){
            EndlessItems.registerCreate();
        }
        if (isThermal){
            EndlessItems.registerThermal();
        }
        if (isDE){
            EndlessItems.registerDE();
        }
        if (isBOT){
            EndlessItems.registerBOT();
        }
        if (isTC3){
            EndlessItems.registerTC3();
        }

        modEventBus.addListener(this::commonSetup);
        //注册物品至mod总线
        EndlessItems.ITEMS.register(modEventBus);
        EndlessBlocks.BLOCKS.register(modEventBus);
        EntityRegistry.ENTITY_TYPES.register(modEventBus);
        EndlessFluids.FLUIDS.register(modEventBus);
        TileTypeRegistry.TILE_ENTITIES.register(modEventBus);
        ContainerTypeRegistry.CONTAINERS.register(modEventBus);
        RecipeTypeRegistry.register(modEventBus);
        ModSounds.SOUNDS.register(modEventBus);
        proxy.registerHandlers();
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        ModRecipeManager.addExtremeCrafts();
        ModRecipeManager.addCompressorCraft();
        ModRecipeManager.lastMinuteChanges();
        Config.loadConfig(); //加载工具黑名单
        event.enqueueWork(NetWorkHandler::registerMessage); //创建数据包
        //添加发射器
        IDispenseItemBehavior itemBehavior = new DefaultDispenseItemBehavior() {
            private final DefaultDispenseItemBehavior defaultBehaviour = new DefaultDispenseItemBehavior();

            /**
             * 分配指定的堆栈，播放分配声音并生成粒子。
             */
            public ItemStack dispenseStack(IBlockSource source, ItemStack stack) {
                BucketItem bucketitem = (BucketItem)stack.getItem();
                BlockPos blockpos = source.getBlockPos().offset(source.getBlockState().get(DispenserBlock.FACING));
                World world = source.getWorld();
                if (bucketitem.tryPlaceContainedLiquid(null, world, blockpos, null)) {
                    bucketitem.onLiquidPlaced(world, stack, blockpos);
                    return new ItemStack(Items.BUCKET);
                } else {
                    return this.defaultBehaviour.dispense(source, stack);
                }
            }
        };
        DispenserBlock.registerDispenseBehavior(EndlessItems.infinityFluidBucket.get(), itemBehavior);
    }

    private void checkMods(){
        isBOT = checkMod("botania");
        isIAF = checkMod("iceandfire");
        isCreate = checkMod("create");
        isTC3 = checkMod("tconstruct");
        isThermal = checkMod("thermal");
        isDE = checkMod("draconicevolution");
        isMysticalAgriculture = checkMod("mysticalagriculture");
        isRS = checkMod("refinedstorage");
        isExtremeReactors = checkMod("bigreactors");
        isMekanism = checkMod("mekanism");
        isChaos = checkMod("chaosawakens");
        isRoost = checkMod("chicken_roost");
        isAllOres = checkMod("alltheores");
    }

    /**
     * 检查模组是否存在
     * @param modId 模组id
     * @return 存在 true
     */
    private boolean checkMod(String modId){
        return ModList.get().isLoaded(modId);
    }

}
