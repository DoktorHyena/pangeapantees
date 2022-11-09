
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pangeaultima.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.pangeaultima.PangeaUltimaMod;

public class PangeaUltimaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PangeaUltimaMod.MODID);
	public static final RegistryObject<SoundEvent> HYENAWHOOP = REGISTRY.register("hyenawhoop",
			() -> new SoundEvent(new ResourceLocation("pangea_ultima", "hyenawhoop")));
	public static final RegistryObject<SoundEvent> GROWL = REGISTRY.register("growl",
			() -> new SoundEvent(new ResourceLocation("pangea_ultima", "growl")));
	public static final RegistryObject<SoundEvent> AMBIENCE = REGISTRY.register("ambience",
			() -> new SoundEvent(new ResourceLocation("pangea_ultima", "ambience")));
	public static final RegistryObject<SoundEvent> TRUMPETER_HORNBILL = REGISTRY.register("trumpeter_hornbill",
			() -> new SoundEvent(new ResourceLocation("pangea_ultima", "trumpeter_hornbill")));
}
