package com.yuo.endless.Recipe;

import cofh.thermal.core.ThermalCore;
import com.buuz135.industrial.module.ModuleTool;
import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import com.integral.enigmaticlegacy.EnigmaticLegacy;
import com.simibubi.create.AllItems;
import com.yuo.endless.Items.EndlessItems;
import com.yuo.endless.Items.Singularity;
import mekanism.common.registries.MekanismItems;
import net.allthemods.alltheores.blocks.BlockList;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;
import slimeknights.tconstruct.shared.TinkerMaterials;

import java.util.Arrays;

/**
 * 模组动态配方
 */
public class ModRecipeManager {

    public static ExtremeCraftRecipe infinityCatalyst; //催化剂
    public static ExtremeCraftRecipe meatBalls; //寰宇肉丸
    public static ExtremeCraftRecipe stew; //超级煲

    public static void addCompressorCraft() {
        CompressorManager.addRecipe(Singularity.getSingularity("silver"), 700,
                getList(new ItemStack(IafItemRegistry.SILVER_INGOT)));
        CompressorManager.addRecipe(Singularity.getSingularity("copper"), 700,
                getList(new ItemStack(IafItemRegistry.COPPER_INGOT)));
        CompressorManager.addRecipe(Singularity.getSingularity("brass"), 350,
                getList(new ItemStack(AllItems.BRASS_INGOT.get())));
        CompressorManager.addRecipe(Singularity.getSingularity("steel"), 700,
                getList(new ItemStack(MekanismItems.STEEL_INGOT.get())));
        CompressorManager.addRecipe(Singularity.getSingularity("nickel"), 700,
                getList(new ItemStack(ThermalCore.ITEMS.get("nickel_ingot"))));
        CompressorManager.addRecipe(Singularity.getSingularity("lead"), 700,
                getList(new ItemStack(ThermalCore.ITEMS.get("lead_ingot"))));
        CompressorManager.addRecipe(Singularity.getSingularity("tin"), 700,
                getList(new ItemStack(ThermalCore.ITEMS.get("tin_ingot"))));
        CompressorManager.addRecipe(Singularity.getSingularity("silver"), 700,
                getList(new ItemStack(ThermalCore.ITEMS.get("silver_ingot"))));
//		CompressorManager.addRecipe(Singularity.getSingularity("electrum"), 700,
//				getList(new ItemStack(ThermalCore.ITEMS.get("electrum_ingot"))));
//		CompressorManager.addRecipe(Singularity.getSingularity("invar"), 700,
//				getList(new ItemStack(ThermalCore.ITEMS.get("invar_ingot"))));
//		CompressorManager.addRecipe(Singularity.getSingularity("enderium"), 700,
//				getList(new ItemStack(ThermalCore.ITEMS.get("enderium_ingot"))));
//		CompressorManager.addRecipe(Singularity.getSingularity("manasteel"), 700,
//				getList(new ItemStack(ModItems.manaSteel)));
//		CompressorManager.addRecipe(Singularity.getSingularity("terrasteel"), 700,
//				getList(new ItemStack(ModItems.terrasteel)));
//		CompressorManager.addRecipe(Singularity.getSingularity("elementium"), 700,
//				getList(new ItemStack(ModItems.elementium)));

        //奇点合成配方
        CompressorManager.addRecipe(Singularity.getSingularity("coal"), 450,
                getList(new ItemStack(Items.COAL)));
        CompressorManager.addRecipe(Singularity.getSingularity("iron"), 300,
                getList(new ItemStack(Items.IRON_INGOT)));
        CompressorManager.addRecipe(Singularity.getSingularity("gold"), 350,
                getList(new ItemStack(Items.GOLD_INGOT)));
        CompressorManager.addRecipe(Singularity.getSingularity("diamond"), 250,
                getList(new ItemStack(Items.DIAMOND)));
        CompressorManager.addRecipe(Singularity.getSingularity("netherite"), 100,
                getList(new ItemStack(Items.NETHERITE_INGOT)));
        CompressorManager.addRecipe(Singularity.getSingularity("emerald"), 200,
                getList(new ItemStack(Items.EMERALD)));
        CompressorManager.addRecipe(Singularity.getSingularity("lapis"), 400,
                getList(new ItemStack(Items.LAPIS_LAZULI)));
        CompressorManager.addRecipe(Singularity.getSingularity("redstone"), 400,
                getList(new ItemStack(Items.REDSTONE)));
        CompressorManager.addRecipe(Singularity.getSingularity("quartz"), 500,
                getList(new ItemStack(Items.QUARTZ)));
        CompressorManager.addRecipe(Singularity.getSingularity("clay"), 450,
                getList(new ItemStack(Items.CLAY)));
    }

    //无尽工作台配方
    public static void addExtremeCrafts() {

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.neutroniumCollector.get()),
                "IIQQQQQII",
                "I QQQQQ I",
                "I  RRR  I",
                "X RRRRR X",
                "I RRXRR I",
                "X RRRRR X",
                "I  RRR  I",
                "I       I",
                "IIIXIXIII",
                'X', new ItemStack(EndlessItems.crystalMatrixIngot.get()),
                'I', new ItemStack(Blocks.IRON_BLOCK),
                'Q', new ItemStack(Blocks.QUARTZ_BLOCK),
                'R', new ItemStack(Blocks.REDSTONE_BLOCK));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityIngot.get()),
                "NNNNNNNNN",
                "NCXXCXXCN",
                "NXCCXCCXN",
                "NCXXCXXCN",
                "NNNNNNNNN",
                'C', new ItemStack(EndlessItems.crystalMatrixIngot.get()),
                'N', new ItemStack(EndlessItems.neutroniumIngot.get()),
                'X', new ItemStack(EndlessItems.infinityCatalyst.get()));
        //无尽催化剂
        infinityCatalyst = ExtremeCraftingManager.getInstance().addShapelessRecipe(new ItemStack(EndlessItems.infinityCatalyst.get()),
                new ItemStack(EndlessItems.crystalMatrixIngot.get()), new ItemStack(EndlessItems.neutroniumIngot.get()),
                new ItemStack(EndlessItems.cosmicMeatBalls.get()), new ItemStack(EndlessItems.ultimateStew.get()),
                new ItemStack(EndlessItems.endestPearl.get()), new ItemStack(EndlessItems.recordFragment.get()),
                Singularity.getSingularity("coal"), Singularity.getSingularity("iron"),
                Singularity.getSingularity("gold"), Singularity.getSingularity("diamond"),
                Singularity.getSingularity("netherite"), Singularity.getSingularity("emerald"),
                Singularity.getSingularity("lapis"), Singularity.getSingularity("redstone"),
                Singularity.getSingularity("quartz"), Singularity.getSingularity("clay"));


        meatBalls = ExtremeCraftingManager.getInstance().addShapelessRecipe(new ItemStack(EndlessItems.cosmicMeatBalls.get()),
                new ItemStack(EndlessItems.neutroniumNugget.get()), new ItemStack(Items.PORKCHOP), new ItemStack(Items.COOKED_PORKCHOP),
                new ItemStack(Items.BEEF), new ItemStack(Items.COOKED_BEEF), new ItemStack(Items.MUTTON), new ItemStack(Items.COOKED_MUTTON),
                new ItemStack(Items.COD), new ItemStack(Items.COOKED_COD), new ItemStack(Items.SALMON), new ItemStack(Items.COOKED_SALMON),
                new ItemStack(Items.TROPICAL_FISH), new ItemStack(Items.PUFFERFISH), new ItemStack(Items.RABBIT), new ItemStack(Items.RABBIT_STEW),
                new ItemStack(Items.COOKED_RABBIT), new ItemStack(Items.CHICKEN), new ItemStack(Items.COOKED_CHICKEN),
                new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.SPIDER_EYE), new ItemStack(Items.EGG));

        stew = ExtremeCraftingManager.getInstance().addShapelessRecipe(new ItemStack(EndlessItems.ultimateStew.get()),
                new ItemStack(EndlessItems.neutroniumNugget.get()), new ItemStack(Items.APPLE), new ItemStack(Items.GOLDEN_APPLE),
                new ItemStack(Items.WHEAT), new ItemStack(Items.BREAD), new ItemStack(Items.KELP), new ItemStack(Items.DRIED_KELP),
                new ItemStack(Items.COCOA_BEANS), new ItemStack(Items.COOKIE), new ItemStack(Items.MELON_SLICE),
                new ItemStack(Items.GLISTERING_MELON_SLICE), new ItemStack(Items.CARROT), new ItemStack(Items.POTATO),
                new ItemStack(Items.BAKED_POTATO), new ItemStack(Items.POISONOUS_POTATO), new ItemStack(Items.CHORUS_FRUIT),
                new ItemStack(Blocks.CAKE), new ItemStack(Items.PUMPKIN_PIE), new ItemStack(Items.BEETROOT),
                new ItemStack(Items.BEETROOT_SOUP), new ItemStack(Items.MUSHROOM_STEW), new ItemStack(Items.HONEY_BOTTLE),
                new ItemStack(Items.SWEET_BERRIES));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityPickaxe.get()),
                " IIIIIII ",
                "IIIICIIII",
                "II  N  II",
                "    N    ",
                "    N    ",
                "    N    ",
                "    N    ",
                "    N    ",
                "    N    ",
                'I', new ItemStack(EndlessItems.infinityIngot.get()),
                'C', new ItemStack(EndlessItems.crystalMatrixBlock.get()),
                'N', new ItemStack(EndlessItems.neutroniumIngot.get()));
        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinitySword.get()),
                "       II",
                "      III",
                "     III ",
                "    III  ",
                " C III   ",
                "  CII    ",
                "  NC     ",
                " N  C    ",
                "X        ",
                'I', new ItemStack(EndlessItems.infinityIngot.get()),
                'X', new ItemStack(EndlessItems.infinityCatalyst.get()),
                'C', new ItemStack(EndlessItems.crystalMatrixIngot.get()),
                'N', new ItemStack(EndlessItems.neutroniumIngot.get()));
        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityShovel.get()),
                "      III",
                "     IIXI",
                "      III",
                "     N I ",
                "    N    ",
                "   N     ",
                "  N      ",
                " N       ",
                "N        ",
                'I', new ItemStack(EndlessItems.infinityIngot.get()),
                'X', new ItemStack(EndlessItems.crystalMatrixBlock.get()),
                'N', new ItemStack(EndlessItems.neutroniumIngot.get()));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityAxe.get()),
                "   I     ",
                "  IIIII  ",
                "  IIXI   ",
                "   IN    ",
                "    N    ",
                "    N    ",
                "    N    ",
                "    N    ",
                "    N    ",
                'I', new ItemStack(EndlessItems.infinityIngot.get()),
                'X', new ItemStack(EndlessItems.crystalMatrixBlock.get()),
                'N', new ItemStack(EndlessItems.neutroniumIngot.get()));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityHoe.get()),
                "     N   ",
                "   IIII  ",
                "  IIIII  ",
                "  I  XI  ",
                "     N   ",
                "     N   ",
                "     N   ",
                "     N   ",
                "     N   ",
                'I', new ItemStack(EndlessItems.infinityIngot.get()),
                'X', new ItemStack(EndlessItems.crystalMatrixBlock.get()),
                'N', new ItemStack(EndlessItems.neutroniumIngot.get()));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityBow.get()),
                "     II  ",
                "    I W  ",
                "   I  W  ",
                "  I   W  ",
                "  X   W  ",
                "  I   W  ",
                "   I  W  ",
                "    I W  ",
                "     II  ",
                'I', new ItemStack(EndlessItems.infinityIngot.get()),
                'X', new ItemStack(EndlessItems.crystalMatrixBlock.get()),
                'W', ItemTags.WOOL);

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityChest.get()),
                " NN   NN ",
                "NNN   NNN",
                "NNN Z NNN",
                " NIIIIIN ",
                " NIIXIIN ",
                " NIIIIIN ",
                " NIIIIIN ",
                " NIIIIIN ",
                "  NNNNN  ",
                'I', new ItemStack(EndlessItems.infinityIngot.get()),
                'X', new ItemStack(EndlessItems.crystalMatrixBlock.get()),
                'N', new ItemStack(EndlessItems.neutroniumIngot.get()),
                'Z', new ItemStack(EnigmaticLegacy.enigmaticItem));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityHead.get()),
                "  NNNNN  ",
                " NIIIIIN ",
                " N XIX N ",
                " NIIIIIN ",
                " NIIIIIN ",
                " NI I IN ",
                "    Z    ",
                'I', new ItemStack(EndlessItems.infinityIngot.get()),
                'X', new ItemStack(EndlessItems.infinityCatalyst.get()),
                'N', new ItemStack(EndlessItems.neutroniumIngot.get()),
				'Z', new ItemStack(EnigmaticLegacy.enigmaticItem));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityLegs.get()),
                "NNNNNNNNN",
                "NIIIXIIIN",
                "NINNXNNIN",
                "NIN Z NIN",
                "NCN   NCN",
                "NIN   NIN",
                "NIN   NIN",
                "NIN   NIN",
                "NNN   NNN",
                'I', new ItemStack(EndlessItems.infinityIngot.get()),
                'X', new ItemStack(EndlessItems.infinityCatalyst.get()),
                'C', new ItemStack(EndlessItems.crystalMatrixBlock.get()),
                'N', new ItemStack(EndlessItems.neutroniumIngot.get()),
		'Z', new ItemStack(EnigmaticLegacy.enigmaticItem));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityFeet.get()),
                " NNNZNNN ",
                " NIN NIN ",
                " NIN NIN ",
                "NNIN NINN",
                "NIIN NIIN",
                "NNNN NNNN",
                'I', new ItemStack(EndlessItems.infinityIngot.get()),
                'N', new ItemStack(EndlessItems.neutroniumIngot.get()),
				'Z', new ItemStack(EnigmaticLegacy.enigmaticItem));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.skullfireSword.get()),
                "       IX",
                "      IXI",
                "     IXI ",
                "    IXI  ",
                " B IXI   ",
                "  BXI    ",
                "  WB     ",
                " W  B    ",
                "D        ",
                'I', new ItemStack(EndlessItems.crystalMatrixIngot.get()),
                'X', new ItemStack(Items.BLAZE_POWDER),
                'B', new ItemStack(Items.BONE),
                'D', new ItemStack(Items.NETHER_STAR),
                'W', ItemTags.LOGS);


        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityArrow.get()),
                "XY       ",
                "YYYY     ",
                " YZ      ",
                " Y Z     ",
                "    Z    ",
                "     Z   ",
                "      AA ",
                "      AAA",
                "       A ",
                'X', new ItemStack(EndlessItems.infinityNugget.get()),
                'Y', new ItemStack(EndlessItems.infinityIngot.get()),
                'Z', new ItemStack(EndlessItems.neutroniumIngot.get()),
                'A', new ItemStack(EndlessItems.crystalMatrixIngot.get()));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityCrossBow.get()),
                "  YYYYY  ",
                " AZ  X   ",
                "YZZZX    ",
                "Y ZBZ    ",
                "Y XZZZ   ",
                "YX  ZZ   ",
                "Y     Z  ",
                "       Z ",
                "         ",
                'X', new ItemStack(EndlessItems.infinityNugget.get()),
                'Y', new ItemStack(EndlessItems.infinityIngot.get()),
                'Z', new ItemStack(EndlessItems.neutroniumIngot.get()),
                'B', new ItemStack(EndlessItems.neutroniumGear.get()),
                'A', new ItemStack(EndlessItems.crystalMatrixBlock.get()));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.endestPearl.get()),
                "   EEE   ",
                " EEPPPEE ",
                " EPPAPPE ",
                "EPPANAPPE",
                "EPANSNAPE",
                "EPPANAPPE",
                " EPPAPPE ",
                " EEPPPEE ",
                "   EEE   ",
                'E', new ItemStack(Blocks.END_STONE),
                'A', new ItemStack(Blocks.TNT),
                'P', new ItemStack(Items.ENDER_PEARL),
                'S', new ItemStack(Items.NETHER_STAR),
                'N', new ItemStack(EndlessItems.neutroniumIngot.get()));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.neutronCompressor.get()),
                "IIIHHHIII",
                "X N   N X",
                "I N   N I",
                "X N   N X",
                "RNN O NNR",
                "X N   N X",
                "I N   N I",
                "X N   N X",
                "IIIXIXIII",
                'X', new ItemStack(EndlessItems.crystalMatrixIngot.get()),
                'N', new ItemStack(EndlessItems.neutroniumIngot.get()),
                'I', new ItemStack(Blocks.IRON_BLOCK),
                'H', new ItemStack(Blocks.HOPPER),
                'R', new ItemStack(Blocks.REDSTONE_BLOCK),
                'O', new ItemStack(EndlessItems.neutroniumBlock.get()));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityBucket.get()),
                "II     II",
                "IIO   OII",
                "IAAO OAAI",
                "IAAX XAAI",
                "IAAX XAAI",
                "IAAXXXAAI",
                "IIAAAAAII",
                " IIAAAII ",
                "  IIIII  ",
                'X', new ItemStack(EndlessItems.infinityIngot.get()),
                'I', new ItemStack(EndlessItems.neutroniumIngot.get()),
                'A', new ItemStack(Items.BUCKET),
                'O', new ItemStack(EndlessItems.infinityCatalyst.get()));

        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.infinityTotem.get()),
                "   AAA   ",
                "  ABBBA  ",
                "  ACBCA  ",
                "DDDBBBDDD",
                " DDBBBDD ",
                "  ABBBA  ",
                "  AAAAA  ",
                "   DDD   ",
                "    D    ",
                'A', new ItemStack(EndlessItems.neutroniumIngot.get()),
                'B', new ItemStack(EndlessItems.infinityNugget.get()),
                'C', new ItemStack(Items.TOTEM_OF_UNDYING),
                'D', new ItemStack(EndlessItems.crystalMatrixIngot.get()));
        ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(EndlessItems.densestNeutroniumCollector.get()),
                "CC     CC",
                "C  BBB  C",
                "  AAAAA  ",
                " BAXXXAB ",
                " BAXYXAB ",
                " BAXXXAB ",
                "  AAAAA  ",
                "C  BBB  C",
                "CC     CC",
                'A', new ItemStack(Items.REDSTONE_BLOCK),
                'B', new ItemStack(EndlessItems.neutroniumIngot.get()),
                'C', new ItemStack(EndlessItems.neutroniumGear.get()),
                'X', new ItemStack(EndlessItems.denserNeutroniumCollector.get()),
                'Y', Singularity.getSingularity("redstone"));
    }


    /**
     * 根据其他模组修改配方
     */
    public static void lastMinuteChanges() {
        ExtremeCraftingManager.getInstance().addRecipeInput(
                infinityCatalyst,
                Singularity.getSingularity("silver"),
                Singularity.getSingularity("copper"),
//				Singularity.getSingularity("manasteel"),
//				Singularity.getSingularity("terrasteel"),
//				Singularity.getSingularity("elementium"),
                Singularity.getSingularity("brass"),
                Singularity.getSingularity("nickel"),
                Singularity.getSingularity("lead"),
                Singularity.getSingularity("tin"),
                Singularity.getSingularity("nuke")
//				Singularity.getSingularity("electrum"),
//				Singularity.getSingularity("invar"),
//				Singularity.getSingularity("enderium")
        );

        // Singularity --
        CompressorManager.addInputs(
                Singularity.getSingularity("silver"),
                getList(
                        new ItemStack(IafItemRegistry.SILVER_INGOT),
                        new ItemStack(BlockList.SILVER_INGOT.get())
                )
        );
        CompressorManager.addInputs(
                Singularity.getSingularity("nickel"),
                getList(
                        new ItemStack(BlockList.NICKEL_INGOT.get())
                )
        );

        CompressorManager.addInputs(
                Singularity.getSingularity("sapphire"),
                getList(
                        new ItemStack(IafItemRegistry.SAPPHIRE_GEM)
                )
        );

        Item mekItemLead = ForgeRegistries.ITEMS.getValue(new ResourceLocation("mekanism", "ingot_lead"));

        CompressorManager.addInputs(
                Singularity.getSingularity("lead"),
                getList(
                        new ItemStack(BlockList.LEAD_INGOT.get()),
                        new ItemStack(mekItemLead)
                )
        );
        Item mekItemTin = ForgeRegistries.ITEMS.getValue(new ResourceLocation("mekanism", "ingot_tin"));

        CompressorManager.addInputs(
                Singularity.getSingularity("tin"),
                getList(
                        new ItemStack(BlockList.TIN_INGOT.get()),
                        new ItemStack(mekItemTin)
                )
        );

        Item mekItemCopper = ForgeRegistries.ITEMS.getValue(new ResourceLocation("mekanism", "ingot_copper"));

        CompressorManager.addInputs(
                Singularity.getSingularity("copper"),
                getList(
                        new ItemStack(AllItems.COPPER_INGOT.get()),
                        new ItemStack(IafItemRegistry.COPPER_INGOT),
                        new ItemStack(mekItemCopper),
                        new ItemStack(BlockList.COPPER_INGOT.get()),
                        new ItemStack(ThermalCore.ITEMS.get("copper_ingot")),
                        new ItemStack(TinkerMaterials.copper.getIngot())

                )
        );

        CompressorManager.addRecipe(Singularity.getSingularity("nuke"),
                4, getList(ModuleTool.INFINITY_NUKE.createStack(9223372036854775807L,1000000, true)));
    }

    /**
     * 获取list
     *
     * @param stacks 物品
     * @return list
     */
    private static NonNullList<ItemStack> getList(ItemStack... stacks) {
        NonNullList<ItemStack> list = NonNullList.create();
        list.addAll(Arrays.asList(stacks));
        return list;
    }
}
