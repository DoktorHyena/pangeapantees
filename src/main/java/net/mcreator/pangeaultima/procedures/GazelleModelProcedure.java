package net.mcreator.pangeaultima.procedures;

import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.pangeaultima.entity.GazelleEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class GazelleModelProcedure extends AnimatedGeoModel<GazelleEntity> {
	@Override
	public ResourceLocation getAnimationResource(GazelleEntity entity) {
		return new ResourceLocation("pangea_ultima", "animations/gazelle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GazelleEntity entity) {
		return new ResourceLocation("pangea_ultima", "geo/gazelle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GazelleEntity entity) {
		return new ResourceLocation("pangea_ultima", "textures/entities/goiteredgazelle.png");
	}

	@Override
	public void setCustomAnimations(GazelleEntity animatable, int instanceId, AnimationEvent animationEvent) {
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
