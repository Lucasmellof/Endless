package com.yuo.endless.Items;

import com.yuo.endless.Armor.InfinityArmor;
import com.yuo.endless.Armor.MyArmorMaterial;
import com.yuo.endless.Armor.OrdinaryArmor;
import com.yuo.endless.Blocks.EndlessBlocks;
import com.yuo.endless.Endless;
import com.yuo.endless.Fluid.EndlessFluids;
import com.yuo.endless.Items.Tool.*;
import com.yuo.endless.tab.ModGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//物品注册管理器
public class EndlessItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Endless.MOD_ID);

	//食物
	public static RegistryObject<Item> cosmicMeatBalls = ITEMS.register("cosmic_meatballs", () -> new OrdinaryFood(MyFoods.MEAT_BALLS));
	public static RegistryObject<Item> ultimateStew = ITEMS.register("ultimate_stew", () -> new OrdinaryFood(MyFoods.STEW));

	//物品
	public static RegistryObject<Item> diamondLattice = ITEMS.register("diamond_lattice", OrdinaryItem::new);
	public static RegistryObject<Item> crystalMatrixIngot = ITEMS.register("crystal_matrix_ingot", OrdinaryItem::new);
	public static RegistryObject<Item> neutroniumPile = ITEMS.register("neutronium_pile", OrdinaryItem::new);
	public static RegistryObject<Item> neutroniumNugget = ITEMS.register("neutronium_nugget", OrdinaryItem::new);
	public static RegistryObject<Item> neutroniumIngot = ITEMS.register("neutronium_ingot", OrdinaryItem::new);
	public static RegistryObject<Item> endestPearl = ITEMS.register("endest_pearl", EndestPearl::new);
	public static RegistryObject<Item> infinityCatalyst = ITEMS.register("infinity_catalyst", InfinityItem::new);
	public static RegistryObject<Item> infinityIngot = ITEMS.register("infinity_ingot", InfinityItem::new);
	public static RegistryObject<Item> recordFragment = ITEMS.register("record_fragment", OrdinaryItem::new);
	public static RegistryObject<Item> matterCluster = ITEMS.register("matter_cluster", MatterCluster::new);
	public static RegistryObject<Item> neutroniumGear = ITEMS.register("neutronium_gear", OrdinaryItem::new);
	public static RegistryObject<Item> starFuel = ITEMS.register("star_fuel", OrdinaryItem::new);
	public static RegistryObject<Item> infinityNugget = ITEMS.register("infinity_nugget", InfinityItem::new);
	public static RegistryObject<Item> infinityArrow = ITEMS.register("infinity_arrow", InfinityArrow::new);

	//奇点
	public static RegistryObject<Item> singularity = ITEMS.register("singularity", Singularity::new);

	/*
	public static RegistryObject<Item> singularityCoal = ITEMS.register("singularity_coal", Singularity::new);
	public static RegistryObject<Item> singularityIron = ITEMS.register("singularity_iron", Singularity::new);
	public static RegistryObject<Item> singularityGold = ITEMS.register("singularity_gold", Singularity::new);
	public static RegistryObject<Item> singularityDiamond = ITEMS.register("singularity_diamond", Singularity::new);
	public static RegistryObject<Item> singularityNetherite = ITEMS.register("singularity_netherite", Singularity::new);
	public static RegistryObject<Item> singularityEmerald = ITEMS.register("singularity_emerald", Singularity::new);
	public static RegistryObject<Item> singularityLapis = ITEMS.register("singularity_lapis", Singularity::new);
	public static RegistryObject<Item> singularityRedstone = ITEMS.register("singularity_redstone", Singularity::new);
	public static RegistryObject<Item> singularityQuartz = ITEMS.register("singularity_quartz", Singularity::new);
	public static RegistryObject<Item> singularityClay = ITEMS.register("singularity_clay", Singularity::new);*/

	//工具
	public static RegistryObject<Item> infinityPickaxe = ITEMS.register("infinity_pickaxe", InfinityPickaxe::new);
	public static RegistryObject<Item> infinityAxe = ITEMS.register("infinity_axe", InfinityAxe::new);
	public static RegistryObject<Item> infinityShovel = ITEMS.register("infinity_shovel", InfinityShovel::new);
	public static RegistryObject<Item> infinityHoe = ITEMS.register("infinity_hoe", InfinityHoe::new);
	public static RegistryObject<Item> infinitySword = ITEMS.register("infinity_sword", InfinitySword::new);
	public static RegistryObject<Item> skullfireSword = ITEMS.register("skullfire_sword", SkullfireSword::new);
	public static RegistryObject<Item> infinityBow = ITEMS.register("infinity_bow", InfinityBow::new);
	public static RegistryObject<Item> infinityCrossBow = ITEMS.register("infinity_crossbow", InfinityCrossBow::new);
	public static RegistryObject<Item> infinityBucket = ITEMS.register("infinity_bucket", InfinityBucket::new);
	public static RegistryObject<Item> infinityTotem = ITEMS.register("infinity_totem", InfinityTotem::new);

	public static RegistryObject<InfinityFluidBucket> infinityFluidBucket = ITEMS.register("infinity_fluid_bucket",
			() -> new InfinityFluidBucket(EndlessFluids.infinityFluid));

	public static RegistryObject<Item> crystalMatrixSword = ITEMS.register("crystal_matrix_sword", () -> new OrdinarySword(MyItemTier.CRYSTAL));
	public static RegistryObject<Item> crystalMatrixPickaxe = ITEMS.register("crystal_matrix_pickaxe", () -> new OrdinaryPickaxe(MyItemTier.CRYSTAL));
	public static RegistryObject<Item> crystalMatrixAxe = ITEMS.register("crystal_matrix_axe", () -> new OrdinaryAxe(MyItemTier.CRYSTAL));
	public static RegistryObject<Item> crystalMatrixShovel = ITEMS.register("crystal_matrix_shovel", () -> new OrdinaryShovel(MyItemTier.CRYSTAL));
	public static RegistryObject<Item> crystalMatrixHoe = ITEMS.register("crystal_matrix_hoe", () -> new OrdinaryHoe(MyItemTier.CRYSTAL));
	public static RegistryObject<Item> neutroniumSword = ITEMS.register("neutronium_sword", () -> new OrdinarySword(MyItemTier.NEUTRON));
	public static RegistryObject<Item> neutroniumPickaxe = ITEMS.register("neutronium_pickaxe", () -> new OrdinaryPickaxe(MyItemTier.NEUTRON));
	public static RegistryObject<Item> neutroniumAxe = ITEMS.register("neutronium_axe", () -> new OrdinaryAxe(MyItemTier.NEUTRON));
	public static RegistryObject<Item> neutroniumShovel = ITEMS.register("neutronium_shovel", () -> new OrdinaryShovel(MyItemTier.NEUTRON));
	public static RegistryObject<Item> neutroniumHoe = ITEMS.register("neutronium_hoe", () -> new OrdinaryHoe(MyItemTier.NEUTRON));


	//盔甲
	public static RegistryObject<ArmorItem> infinityHead = ITEMS.register("infinity_helmet", () -> new InfinityArmor(EquipmentSlotType.HEAD));
	public static RegistryObject<ArmorItem> infinityChest = ITEMS.register("infinity_chestplate", () -> new InfinityArmor(EquipmentSlotType.CHEST));
	public static RegistryObject<ArmorItem> infinityLegs = ITEMS.register("infinity_leggings", () -> new InfinityArmor(EquipmentSlotType.LEGS));
	public static RegistryObject<ArmorItem> infinityFeet = ITEMS.register("infinity_boots", () -> new InfinityArmor(EquipmentSlotType.FEET));
	public static RegistryObject<ArmorItem> crystalMatrixHead = ITEMS.register("crystal_matrix_helmet", () -> new OrdinaryArmor(MyArmorMaterial.CRYSTAL, EquipmentSlotType.HEAD));
	public static RegistryObject<ArmorItem> crystalMatrixChest = ITEMS.register("crystal_matrix_chestplate", () -> new OrdinaryArmor(MyArmorMaterial.CRYSTAL, EquipmentSlotType.CHEST));
	public static RegistryObject<ArmorItem> crystalMatrixLeggings = ITEMS.register("crystal_matrix_leggings", () -> new OrdinaryArmor(MyArmorMaterial.CRYSTAL, EquipmentSlotType.LEGS));
	public static RegistryObject<ArmorItem> crystalMatrixFeet = ITEMS.register("crystal_matrix_boots", () -> new OrdinaryArmor(MyArmorMaterial.CRYSTAL, EquipmentSlotType.FEET));
	public static RegistryObject<ArmorItem> neutroniumHead = ITEMS.register("neutronium_helmet", () -> new OrdinaryArmor(MyArmorMaterial.NEUTRON, EquipmentSlotType.HEAD));
	public static RegistryObject<ArmorItem> neutroniumChest = ITEMS.register("neutronium_chestplate", () -> new OrdinaryArmor(MyArmorMaterial.NEUTRON, EquipmentSlotType.CHEST));
	public static RegistryObject<ArmorItem> neutroniumLegs = ITEMS.register("neutronium_leggings", () -> new OrdinaryArmor(MyArmorMaterial.NEUTRON, EquipmentSlotType.LEGS));
	public static RegistryObject<ArmorItem> neutroniumFeet = ITEMS.register("neutronium_boots", () -> new OrdinaryArmor(MyArmorMaterial.NEUTRON, EquipmentSlotType.FEET));


	//注册方块物品
	public static RegistryObject<BlockItem> infinityBlock = ITEMS.register("infinity_block",
			() -> new BlockItem(EndlessBlocks.infinityBlock.get(), new Item.Properties().group(ModGroup.endless).isImmuneToFire()));
	public static RegistryObject<BlockItem> crystalMatrixBlock = ITEMS.register("crystal_matrix_block",
			() -> new BlockItem(EndlessBlocks.crystalMatrixBlock.get(), new Item.Properties().group(ModGroup.endless)));
	public static RegistryObject<BlockItem> neutroniumBlock = ITEMS.register("neutronium_block",
			() -> new BlockItem(EndlessBlocks.neutroniumBlock.get(), new Item.Properties().group(ModGroup.endless)));
	public static RegistryObject<BlockItem> compressedCraftingTable = ITEMS.register("compressed_crafting_table",
			() -> new BlockItem(EndlessBlocks.compressedCraftingTable.get(), new Item.Properties().group(ModGroup.endless)));
	public static RegistryObject<BlockItem> doubleCompressedCraftingTable = ITEMS.register("double_compressed_crafting_table",
			() -> new BlockItem(EndlessBlocks.doubleCompressedCraftingTable.get(), new Item.Properties().group(ModGroup.endless)));
	public static RegistryObject<BlockItem> extremeCraftingTable = ITEMS.register("extreme_crafting_table",
			() -> new BlockItem(EndlessBlocks.extremeCraftingTable.get(), new Item.Properties().group(ModGroup.endless).isImmuneToFire()));
	public static RegistryObject<BlockItem> neutroniumCollector = ITEMS.register("neutronium_collector",
			() -> new BlockItem(EndlessBlocks.neutroniumCollector.get(), new Item.Properties().group(ModGroup.endless)));
	public static RegistryObject<BlockItem> denseNeutroniumCollector = ITEMS.register("dense_neutronium_collector",
			() -> new BlockItem(EndlessBlocks.denseNeutroniumCollector.get(), new Item.Properties().group(ModGroup.endless)));
	public static RegistryObject<BlockItem> denserNeutroniumCollector = ITEMS.register("denser_neutronium_collector",
			() -> new BlockItem(EndlessBlocks.denserNeutroniumCollector.get(), new Item.Properties().group(ModGroup.endless)));
	public static RegistryObject<BlockItem> densestNeutroniumCollector = ITEMS.register("densest_neutronium_collector",
			() -> new BlockItem(EndlessBlocks.densestNeutroniumCollector.get(), new Item.Properties().group(ModGroup.endless).isImmuneToFire()));
	public static RegistryObject<BlockItem> neutronCompressor = ITEMS.register("neutron_compressor",
			() -> new BlockItem(EndlessBlocks.neutronCompressor.get(), new Item.Properties().group(ModGroup.endless)));
	public static RegistryObject<BlockItem> compressedChest = ITEMS.register("compressed_chest",
			() -> new BlockItem(EndlessBlocks.compressedChest.get(), new Item.Properties().group(ModGroup.endless).maxStackSize(1)));
	public static RegistryObject<BlockItem> infinityBox = ITEMS.register("infinity_chest",
			() -> new BlockItem(EndlessBlocks.infinityBox.get(), new Item.Properties().group(ModGroup.endless).maxStackSize(1).isImmuneToFire()));
	/*
	//联动奇点
	public static RegistryObject<Item> singularityRuby; //红宝石
	public static RegistryObject<Item> singularityDragon; //龙晶
	public static RegistryObject<Item> singularitySpace; //空间
	public static RegistryObject<Item> singularityXray; //X光
	public static RegistryObject<Item> singularityUltra; //极限
	public static RegistryObject<Item> singularitySilver; //银
	public static RegistryObject<Item> singularityCopper; //铜
	public static RegistryObject<Item> singularityZinc; //锌
//	public static RegistryObject<Item> singularityPlatinum; //铂
//	public static RegistryObject<Item> singularityAluminum; //铝
	public static RegistryObject<Item> singularityNickel; //镍
	public static RegistryObject<Item> singularityLead; //铅
	public static RegistryObject<Item> singularityTin; //锡
//	public static RegistryObject<Item> singularityIridium; //铱
	public static RegistryObject<Item> singularityDragonIum; //龙锭
	public static RegistryObject<Item> singularityAwakenDragon; //觉醒龙锭
	public static RegistryObject<Item> singularityMana; //魔钢
	public static RegistryObject<Item> singularityTara; //泰拉钢
	public static RegistryObject<Item> singularityElementIum; //源质钢
	public static RegistryObject<Item> singularityDarkMatter; //暗物质
	public static RegistryObject<Item> singularityRedMatter; //红物质
	public static RegistryObject<Item> singularityCobalt; //钴
	public static RegistryObject<Item> singularityManyullyn; //玛玉灵
	*/


	//冰与火
	public static void registerIafItem() {
		Singularity.addSingularity(new Singularity.SingularityData("silver", 0xf3faff, 0xe5ecf7));
		Singularity.addSingularity(new Singularity.SingularityData("copper", 0x95654c, 0xbd896d));
	}

	//机械动力
	public static void registerCreate() {
		Singularity.addSingularity(new Singularity.SingularityData("brass", 0xfff4a3, 0xc9974c));
	}

	public static void registerMekanism() {
		Singularity.addSingularity(new Singularity.SingularityData("steel", 0xc0bebc, 0x949494));
		Singularity.addSingularity(new Singularity.SingularityData("osmium", 0xcedff2, 0x9aacd4));
	}

	//热力
	public static void registerThermal() {
		Singularity.addSingularity(new Singularity.SingularityData("nickel", 0x916e4d, 0xf9f5ab));
		Singularity.addSingularity(new Singularity.SingularityData("lead", 0x232457, 0x393c61));
		Singularity.addSingularity(new Singularity.SingularityData("tin", 0x517c88, 0x88a2a7));
		Singularity.addSingularity(new Singularity.SingularityData("silver", 0x758392, 0x647380));
		Singularity.addSingularity(new Singularity.SingularityData("electrum", 0xfbfbbc, 0xc9b255));
		Singularity.addSingularity(new Singularity.SingularityData("invar", 0xc5ccc3, 0x768885));
		Singularity.addSingularity(new Singularity.SingularityData("sapphire", 0x77c8ff, 0x51aeff));
		Singularity.addSingularity(new Singularity.SingularityData("enderium", 0x2ca8af, 0x1d7e8c));
		Singularity.addSingularity(new Singularity.SingularityData("apatite", 0x97ffff, 0x185d95));


	}

	public static void registerBOT() {
		Singularity.addSingularity(new Singularity.SingularityData("manasteel", 0x49a5ee, 0x50b4ff));
		Singularity.addSingularity(new Singularity.SingularityData("terrasteel", 0x51dc24, 0x57ef26));
		Singularity.addSingularity(new Singularity.SingularityData("elementium", 0xe464ff, 0xe784ff));
	}

	public static void registerDE() {
		Singularity.addSingularity(new Singularity.SingularityData("draconium", 0x6b369b, 0x6c389a));
		Singularity.addSingularity(new Singularity.SingularityData("awakened_draconium", 0xf45100, 0xeecb3d));
	}

	//匠魂3
	public static void registerTC3() {
		Singularity.addSingularity(new Singularity.SingularityData("cobalt", 0x0753b8, 0x59a6ef));
		Singularity.addSingularity(new Singularity.SingularityData("manyullyn", 0xa97de0, 0xcfacf9));
		Singularity.addSingularity(new Singularity.SingularityData("rose_gold", 0xF7CDBB, 0xF7CDBB));
		Singularity.addSingularity(new Singularity.SingularityData("hepatizon", 0x60496B, 0x60496B));
	}

	public static void registerBigReactors() {
		Singularity.addSingularity(new Singularity.SingularityData("blutonium", 0x17179c, 0x17179c));
	}

	public static void registerTitanium() {
		Singularity.addSingularity(new Singularity.SingularityData("titanium", 0x8ebee2, 0x76a1e2));
	}

	public static void registerRoost() {
		Singularity.addSingularity(new Singularity.SingularityData("adamantium", 0x9fffbf, 0x4fdf6f));
	}

	public static void registerAllOres() {
		Singularity.addSingularity(new Singularity.SingularityData("aluminum", 0xdce4e6, 0xf9ffff));
		Singularity.addSingularity(new Singularity.SingularityData("uranium", 0xbbd195, 0x8db668));
		Singularity.addSingularity(new Singularity.SingularityData("platinum", 0xc8fbff, 0x67d5f7));
	}
}
