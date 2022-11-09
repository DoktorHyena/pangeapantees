package net.mcreator.pangeaultima.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.pangeaultima.entity.TigerEntity;
import net.mcreator.pangeaultima.entity.HyenaEntity;
import net.mcreator.pangeaultima.entity.CoyoteEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HyenaAttackProcedure {
	@SubscribeEvent
	public static void onEntitySetsAttackTarget(LivingSetAttackTargetEvent event) {
		execute(event, event.getTarget());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof HyenaEntity) {
			entity.setSprinting((true));
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof TigerEntity) {
			entity.setSprinting((true));
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof CoyoteEntity) {
			entity.setSprinting((true));
		}
	}
}
