
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pangeaultima.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.pangeaultima.client.renderer.ZebraRenderer;
import net.mcreator.pangeaultima.client.renderer.WildebeestRenderer;
import net.mcreator.pangeaultima.client.renderer.TigerRenderer;
import net.mcreator.pangeaultima.client.renderer.RhinoRenderer;
import net.mcreator.pangeaultima.client.renderer.OstrichRenderer;
import net.mcreator.pangeaultima.client.renderer.NortherngiraffeRenderer;
import net.mcreator.pangeaultima.client.renderer.HyenaRenderer;
import net.mcreator.pangeaultima.client.renderer.HornbillRenderer;
import net.mcreator.pangeaultima.client.renderer.GazelleRenderer;
import net.mcreator.pangeaultima.client.renderer.CoyoteRenderer;
import net.mcreator.pangeaultima.client.renderer.BongoRenderer;
import net.mcreator.pangeaultima.client.renderer.BlackRhinoRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PangeaUltimaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PangeaUltimaModEntities.NORTHERNGIRAFFE.get(), NortherngiraffeRenderer::new);
		event.registerEntityRenderer(PangeaUltimaModEntities.HYENA.get(), HyenaRenderer::new);
		event.registerEntityRenderer(PangeaUltimaModEntities.ZEBRA.get(), ZebraRenderer::new);
		event.registerEntityRenderer(PangeaUltimaModEntities.WILDEBEEST.get(), WildebeestRenderer::new);
		event.registerEntityRenderer(PangeaUltimaModEntities.OSTRICH.get(), OstrichRenderer::new);
		event.registerEntityRenderer(PangeaUltimaModEntities.BONGO_SPEAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PangeaUltimaModEntities.BONGO.get(), BongoRenderer::new);
		event.registerEntityRenderer(PangeaUltimaModEntities.TIGER.get(), TigerRenderer::new);
		event.registerEntityRenderer(PangeaUltimaModEntities.GAZELLE.get(), GazelleRenderer::new);
		event.registerEntityRenderer(PangeaUltimaModEntities.COYOTE.get(), CoyoteRenderer::new);
		event.registerEntityRenderer(PangeaUltimaModEntities.RHINO.get(), RhinoRenderer::new);
		event.registerEntityRenderer(PangeaUltimaModEntities.BLACK_RHINO.get(), BlackRhinoRenderer::new);
		event.registerEntityRenderer(PangeaUltimaModEntities.HORNBILL.get(), HornbillRenderer::new);
	}
}
