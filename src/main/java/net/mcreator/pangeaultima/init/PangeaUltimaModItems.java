
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pangeaultima.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.pangeaultima.item.GazelleChopsItem;
import net.mcreator.pangeaultima.item.BongoSpearItem;
import net.mcreator.pangeaultima.PangeaUltimaMod;

public class PangeaUltimaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PangeaUltimaMod.MODID);
	public static final RegistryObject<Item> NORTHERNGIRAFFE = REGISTRY.register("northerngiraffe_spawn_egg",
			() -> new ForgeSpawnEggItem(PangeaUltimaModEntities.NORTHERNGIRAFFE, -2314143, -10339814,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HYENA = REGISTRY.register("hyena_spawn_egg",
			() -> new ForgeSpawnEggItem(PangeaUltimaModEntities.HYENA, -6590403, -14346743, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ZEBRA = REGISTRY.register("zebra_spawn_egg",
			() -> new ForgeSpawnEggItem(PangeaUltimaModEntities.ZEBRA, -1, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> WILDEBEEST = REGISTRY.register("wildebeest_spawn_egg",
			() -> new ForgeSpawnEggItem(PangeaUltimaModEntities.WILDEBEEST, -10330801, -11188677,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> OSTRICH = REGISTRY.register("ostrich_spawn_egg",
			() -> new ForgeSpawnEggItem(PangeaUltimaModEntities.OSTRICH, -14147552, -3304067, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BONGO_SPEAR = REGISTRY.register("bongo_spear", () -> new BongoSpearItem());
	public static final RegistryObject<Item> BONGO = REGISTRY.register("bongo_spawn_egg",
			() -> new ForgeSpawnEggItem(PangeaUltimaModEntities.BONGO, -10079488, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TIGER = REGISTRY.register("tiger_spawn_egg",
			() -> new ForgeSpawnEggItem(PangeaUltimaModEntities.TIGER, -2655420, -14806504, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GAZELLE = REGISTRY.register("gazelle_spawn_egg",
			() -> new ForgeSpawnEggItem(PangeaUltimaModEntities.GAZELLE, -9744328, -11455451, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GAZELLE_CHOPS = REGISTRY.register("gazelle_chops", () -> new GazelleChopsItem());
	public static final RegistryObject<Item> COYOTE = REGISTRY.register("coyote_spawn_egg",
			() -> new ForgeSpawnEggItem(PangeaUltimaModEntities.COYOTE, -6457512, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RHINO = REGISTRY.register("rhino_spawn_egg",
			() -> new ForgeSpawnEggItem(PangeaUltimaModEntities.RHINO, -10918030, -13157047, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BLACK_RHINO = REGISTRY.register("black_rhino_spawn_egg",
			() -> new ForgeSpawnEggItem(PangeaUltimaModEntities.BLACK_RHINO, -7509168, -9745096,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BAOBAB_WOOD = block(PangeaUltimaModBlocks.BAOBAB_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAOBAB_LOG = block(PangeaUltimaModBlocks.BAOBAB_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAOBAB_PLANKS = block(PangeaUltimaModBlocks.BAOBAB_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAOBAB_LEAVES = block(PangeaUltimaModBlocks.BAOBAB_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BAOBAB_STAIRS = block(PangeaUltimaModBlocks.BAOBAB_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAOBAB_SLAB = block(PangeaUltimaModBlocks.BAOBAB_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAOBAB_FENCE = block(PangeaUltimaModBlocks.BAOBAB_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BAOBAB_FENCE_GATE = block(PangeaUltimaModBlocks.BAOBAB_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BAOBAB_PRESSURE_PLATE = block(PangeaUltimaModBlocks.BAOBAB_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BAOBAB_BUTTON = block(PangeaUltimaModBlocks.BAOBAB_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HORNBILL = REGISTRY.register("hornbill_spawn_egg",
			() -> new ForgeSpawnEggItem(PangeaUltimaModEntities.HORNBILL, -13421773, -10066330, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
