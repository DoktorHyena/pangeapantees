package net.mcreator.pangeaultima.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.pangeaultima.entity.TigerEntity;
import net.mcreator.pangeaultima.entity.HyenaEntity;
import net.mcreator.pangeaultima.entity.GazelleEntity;
import net.mcreator.pangeaultima.entity.CoyoteEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GazelleRunProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof GazelleEntity) {
			if (!world.getEntitiesOfClass(HyenaEntity.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()) {
				if (entity.getDeltaMovement().x() > 0 || entity.getDeltaMovement().z() > 0) {
					entity.setSprinting((true));
				}
			}
			if (!world.getEntitiesOfClass(TigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()) {
				if (entity.getDeltaMovement().x() > 0 || entity.getDeltaMovement().z() > 0) {
					entity.setSprinting((true));
				}
			}
			if (!world.getEntitiesOfClass(CoyoteEntity.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()) {
				if (entity.getDeltaMovement().x() > 0 || entity.getDeltaMovement().z() > 0) {
					entity.setSprinting((true));
				}
			}
		}
		if (entity instanceof CoyoteEntity) {
			if (!world.getEntitiesOfClass(HyenaEntity.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()) {
				if (entity.getDeltaMovement().x() > 0 || entity.getDeltaMovement().z() > 0) {
					entity.setSprinting((true));
				}
			}
			if (!world.getEntitiesOfClass(TigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()) {
				if (entity.getDeltaMovement().x() > 0 || entity.getDeltaMovement().z() > 0) {
					entity.setSprinting((true));
				}
			}
		}
	}
}
