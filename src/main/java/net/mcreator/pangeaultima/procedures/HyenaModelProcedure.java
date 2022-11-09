package net.mcreator.pangeaultima.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pangeaultima.entity.HyenaEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class HyenaModelProcedure extends AnimatedGeoModel<HyenaEntity> {
	@Override
	public ResourceLocation getAnimationResource(HyenaEntity entity) {
		return new ResourceLocation("pangea_ultima", "animations/hyena.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HyenaEntity entity) {
		return new ResourceLocation("pangea_ultima", "geo/hyena.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HyenaEntity entity) {
		return new ResourceLocation("pangea_ultima", "textures/entities/crocuta_1.png");
		/**
		}
		@Override
		public void setCustomAnimations(HyenaEntity animatable, int instanceId, AnimationEvent animationEvent) {
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
