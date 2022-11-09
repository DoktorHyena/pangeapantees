package net.mcreator.pangeaultima.procedures;

import net.minecraft.world.entity.Entity;

public class NortherngiraffeRunAttemptProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isSprinting()) {
			entity.setSprinting((false));
		}
	}
}
