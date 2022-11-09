package net.mcreator.pangeaultima.procedures;

import net.minecraft.world.entity.Entity;

public class ZebraOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSprinting((false));
	}
}
