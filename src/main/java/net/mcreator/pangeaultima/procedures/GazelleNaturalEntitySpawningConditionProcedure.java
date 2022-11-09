package net.mcreator.pangeaultima.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GazelleNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("desert"))) {
			return true;
		} else if (!world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("desert"))) {
			return false;
		}
		return true;
	}
}
