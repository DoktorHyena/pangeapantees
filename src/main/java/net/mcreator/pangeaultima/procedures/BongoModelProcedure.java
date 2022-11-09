package net.mcreator.pangeaultima.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pangeaultima.entity.BongoEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class BongoModelProcedure extends AnimatedGeoModel<BongoEntity> {
	@Override
	public ResourceLocation getAnimationResource(BongoEntity entity) {
		return new ResourceLocation("pangea_ultima", "animations/bongo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BongoEntity entity) {
		return new ResourceLocation("pangea_ultima", "geo/bongo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BongoEntity entity) {
		return new ResourceLocation("pangea_ultima", "textures/entities/bongo.png");
		/**
		}
		@Override
		public void setCustomAnimations(BongoEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
		/** **/
	}
}
