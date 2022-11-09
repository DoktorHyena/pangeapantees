package net.mcreator.pangeaultima.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pangeaultima.entity.NortherngiraffeEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class GiraffeModelProcedure extends AnimatedGeoModel<NortherngiraffeEntity> {
	@Override
	public ResourceLocation getAnimationResource(NortherngiraffeEntity entity) {
		return new ResourceLocation("pangea_ultima", "animations/northern_giraffe.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NortherngiraffeEntity entity) {
		return new ResourceLocation("pangea_ultima", "geo/northern_giraffe.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NortherngiraffeEntity entity) {
		return new ResourceLocation("pangea_ultima", "textures/entities/giraffetex.png");
		/**
		}
		@Override
		public void setCustomAnimations(NortherngiraffeEntity animatable, int instanceId, AnimationEvent animationEvent) {
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
