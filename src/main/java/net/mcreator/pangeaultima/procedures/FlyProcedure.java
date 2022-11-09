package net.mcreator.pangeaultima.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.pangeaultima.entity.HornbillEntity;

public class FlyProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof Player _player) {
			_player.getAbilities().flying = (true);
			_player.onUpdateAbilities();
		}
		if (entity instanceof HornbillEntity) {
			((HornbillEntity) entity).animationprocedure = "fly";
		}
		return true;
	}
}
