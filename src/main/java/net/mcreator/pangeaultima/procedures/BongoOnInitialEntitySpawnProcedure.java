package net.mcreator.pangeaultima.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.pangeaultima.entity.BongoEntity;

public class BongoOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false) {
			if (entity instanceof BongoEntity) {
				((BongoEntity) entity).animationprocedure = "baby";
			}
		}
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false)) {
			if (entity instanceof BongoEntity) {
				((BongoEntity) entity).animationprocedure = "empty";
			}
		}
	}
}
