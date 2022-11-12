
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pangeaultima.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.pangeaultima.block.BaobabWoodBlock;
import net.mcreator.pangeaultima.block.BaobabStairsBlock;
import net.mcreator.pangeaultima.block.BaobabSlabBlock;
import net.mcreator.pangeaultima.block.BaobabPressurePlateBlock;
import net.mcreator.pangeaultima.block.BaobabPlanksBlock;
import net.mcreator.pangeaultima.block.BaobabLogBlock;
import net.mcreator.pangeaultima.block.BaobabLeavesBlock;
import net.mcreator.pangeaultima.block.BaobabFenceGateBlock;
import net.mcreator.pangeaultima.block.BaobabFenceBlock;
import net.mcreator.pangeaultima.block.BaobabButtonBlock;
import net.mcreator.pangeaultima.PangeaUltimaMod;

public class PangeaUltimaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PangeaUltimaMod.MODID);
	public static final RegistryObject<Block> BAOBAB_WOOD = REGISTRY.register("baobab_wood", () -> new BaobabWoodBlock());
	public static final RegistryObject<Block> BAOBAB_LOG = REGISTRY.register("baobab_log", () -> new BaobabLogBlock());
	public static final RegistryObject<Block> BAOBAB_PLANKS = REGISTRY.register("baobab_planks", () -> new BaobabPlanksBlock());
	public static final RegistryObject<Block> BAOBAB_LEAVES = REGISTRY.register("baobab_leaves", () -> new BaobabLeavesBlock());
	public static final RegistryObject<Block> BAOBAB_STAIRS = REGISTRY.register("baobab_stairs", () -> new BaobabStairsBlock());
	public static final RegistryObject<Block> BAOBAB_SLAB = REGISTRY.register("baobab_slab", () -> new BaobabSlabBlock());
	public static final RegistryObject<Block> BAOBAB_FENCE = REGISTRY.register("baobab_fence", () -> new BaobabFenceBlock());
	public static final RegistryObject<Block> BAOBAB_FENCE_GATE = REGISTRY.register("baobab_fence_gate", () -> new BaobabFenceGateBlock());
	public static final RegistryObject<Block> BAOBAB_PRESSURE_PLATE = REGISTRY.register("baobab_pressure_plate",
			() -> new BaobabPressurePlateBlock());
	public static final RegistryObject<Block> BAOBAB_BUTTON = REGISTRY.register("baobab_button", () -> new BaobabButtonBlock());
}
