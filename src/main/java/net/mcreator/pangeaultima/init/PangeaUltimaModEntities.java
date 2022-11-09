
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pangeaultima.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.pangeaultima.entity.ZebraEntity;
import net.mcreator.pangeaultima.entity.WildebeestEntity;
import net.mcreator.pangeaultima.entity.TigerEntity;
import net.mcreator.pangeaultima.entity.RhinoEntity;
import net.mcreator.pangeaultima.entity.OstrichEntity;
import net.mcreator.pangeaultima.entity.NortherngiraffeEntity;
import net.mcreator.pangeaultima.entity.HyenaEntity;
import net.mcreator.pangeaultima.entity.HornbillEntity;
import net.mcreator.pangeaultima.entity.GazelleEntity;
import net.mcreator.pangeaultima.entity.CoyoteEntity;
import net.mcreator.pangeaultima.entity.BongoSpearEntity;
import net.mcreator.pangeaultima.entity.BongoEntity;
import net.mcreator.pangeaultima.entity.BlackRhinoEntity;
import net.mcreator.pangeaultima.PangeaUltimaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PangeaUltimaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PangeaUltimaMod.MODID);
	public static final RegistryObject<EntityType<NortherngiraffeEntity>> NORTHERNGIRAFFE = register("northerngiraffe",
			EntityType.Builder.<NortherngiraffeEntity>of(NortherngiraffeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NortherngiraffeEntity::new)

					.sized(1.5f, 4f));
	public static final RegistryObject<EntityType<HyenaEntity>> HYENA = register("hyena",
			EntityType.Builder.<HyenaEntity>of(HyenaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(HyenaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZebraEntity>> ZEBRA = register("zebra",
			EntityType.Builder.<ZebraEntity>of(ZebraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ZebraEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WildebeestEntity>> WILDEBEEST = register("wildebeest",
			EntityType.Builder.<WildebeestEntity>of(WildebeestEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WildebeestEntity::new)

					.sized(1f, 1.0999999999999999f));
	public static final RegistryObject<EntityType<OstrichEntity>> OSTRICH = register("ostrich",
			EntityType.Builder.<OstrichEntity>of(OstrichEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(OstrichEntity::new)

					.sized(0.7999999999999999f, 2f));
	public static final RegistryObject<EntityType<BongoSpearEntity>> BONGO_SPEAR = register("projectile_bongo_spear",
			EntityType.Builder.<BongoSpearEntity>of(BongoSpearEntity::new, MobCategory.MISC).setCustomClientFactory(BongoSpearEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BongoEntity>> BONGO = register("bongo",
			EntityType.Builder.<BongoEntity>of(BongoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BongoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TigerEntity>> TIGER = register("tiger",
			EntityType.Builder.<TigerEntity>of(TigerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(TigerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GazelleEntity>> GAZELLE = register("gazelle",
			EntityType.Builder.<GazelleEntity>of(GazelleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GazelleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CoyoteEntity>> COYOTE = register("coyote",
			EntityType.Builder.<CoyoteEntity>of(CoyoteEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(CoyoteEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RhinoEntity>> RHINO = register("rhino",
			EntityType.Builder.<RhinoEntity>of(RhinoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RhinoEntity::new)

					.sized(0.7999999999999999f, 1.8f));
	public static final RegistryObject<EntityType<BlackRhinoEntity>> BLACK_RHINO = register("black_rhino",
			EntityType.Builder.<BlackRhinoEntity>of(BlackRhinoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackRhinoEntity::new)

					.sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<HornbillEntity>> HORNBILL = register("hornbill",
			EntityType.Builder.<HornbillEntity>of(HornbillEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HornbillEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			NortherngiraffeEntity.init();
			HyenaEntity.init();
			ZebraEntity.init();
			WildebeestEntity.init();
			OstrichEntity.init();
			BongoEntity.init();
			TigerEntity.init();
			GazelleEntity.init();
			CoyoteEntity.init();
			RhinoEntity.init();
			BlackRhinoEntity.init();
			HornbillEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NORTHERNGIRAFFE.get(), NortherngiraffeEntity.createAttributes().build());
		event.put(HYENA.get(), HyenaEntity.createAttributes().build());
		event.put(ZEBRA.get(), ZebraEntity.createAttributes().build());
		event.put(WILDEBEEST.get(), WildebeestEntity.createAttributes().build());
		event.put(OSTRICH.get(), OstrichEntity.createAttributes().build());
		event.put(BONGO.get(), BongoEntity.createAttributes().build());
		event.put(TIGER.get(), TigerEntity.createAttributes().build());
		event.put(GAZELLE.get(), GazelleEntity.createAttributes().build());
		event.put(COYOTE.get(), CoyoteEntity.createAttributes().build());
		event.put(RHINO.get(), RhinoEntity.createAttributes().build());
		event.put(BLACK_RHINO.get(), BlackRhinoEntity.createAttributes().build());
		event.put(HORNBILL.get(), HornbillEntity.createAttributes().build());
	}
}
