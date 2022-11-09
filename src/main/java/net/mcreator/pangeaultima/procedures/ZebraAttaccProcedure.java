package net.mcreator.pangeaultima.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.pangeaultima.entity.ZebraEntity;
import net.mcreator.pangeaultima.entity.NortherngiraffeEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ZebraAttaccProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof NortherngiraffeEntity) {
			{
				Entity _ent = sourceentity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("attack");
				if (_so == null)
					_so = _sc.addObjective("attack", ObjectiveCriteria.DUMMY, Component.literal("attack"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
			}
			if (sourceentity instanceof NortherngiraffeEntity) {
				((NortherngiraffeEntity) sourceentity).animationprocedure = "attack";
			}
		}
		if (sourceentity instanceof ZebraEntity) {
			{
				Entity _ent = sourceentity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("attack");
				if (_so == null)
					_so = _sc.addObjective("attack", ObjectiveCriteria.DUMMY, Component.literal("attack"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
			}
			if (sourceentity instanceof ZebraEntity) {
				((ZebraEntity) sourceentity).animationprocedure = "attack";
			}
		}
	}
}
