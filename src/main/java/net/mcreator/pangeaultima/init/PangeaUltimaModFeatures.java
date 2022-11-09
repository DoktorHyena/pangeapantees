
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pangeaultima.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.pangeaultima.world.features.plants.ElephantGrassFeature;
import net.mcreator.pangeaultima.world.features.BushMainFeature;
import net.mcreator.pangeaultima.world.features.BaobabTreeFeature;
import net.mcreator.pangeaultima.PangeaUltimaMod;

@Mod.EventBusSubscriber
public class PangeaUltimaModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PangeaUltimaMod.MODID);
	public static final RegistryObject<Feature<?>> ELEPHANT_GRASS = REGISTRY.register("elephant_grass", ElephantGrassFeature::feature);
	public static final RegistryObject<Feature<?>> BUSH_MAIN = REGISTRY.register("bush_main", BushMainFeature::feature);
	public static final RegistryObject<Feature<?>> BAOBAB_TREE = REGISTRY.register("baobab_tree", BaobabTreeFeature::feature);
}
