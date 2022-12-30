package net.mindshake.witchmobility;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.mindshake.witchmobility.client.renderer.entity.*;
import net.mindshake.witchmobility.client.renderer.item.*;
import net.mindshake.witchmobility.registry.ModEntities;
import net.mindshake.witchmobility.registry.ModItems;
import net.mindshake.witchmobility.screen.ModScreenHandlers;
import net.mindshake.witchmobility.screen.glyphtable.GlyphTableScreen;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MainClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ModScreenHandlers.GLYPH_TABLE_SCREEN_HANDLER, GlyphTableScreen::new);

        EntityRendererRegistry.register(ModEntities.BASIC_BROOM, BasicBroomEntityRenderer::new);
        GeoItemRenderer.registerItemRenderer(ModItems.BASIC_BROOM, new BasicBroomItemRenderer());

        EntityRendererRegistry.register(ModEntities.BLUE_BOTTLE_BROOM, BlueBottleBroomEntityRenderer::new);
        GeoItemRenderer.registerItemRenderer(ModItems.BLUE_BOTTLE_BROOM, new BlueBottleBroomItemRenderer());

        EntityRendererRegistry.register(ModEntities.SILVER_ARROW_BROOM, SilverArrowBroomEntityRenderer::new);
        GeoItemRenderer.registerItemRenderer(ModItems.SILVER_ARROW_BROOM, new SilverArrowBroomItemRenderer());

        EntityRendererRegistry.register(ModEntities.FIREBOLT_BROOM, FireboltBroomEntityRenderer::new);
        GeoItemRenderer.registerItemRenderer(ModItems.FIREBOLT_BROOM, new FireboltBroomItemRenderer());

        EntityRendererRegistry.register(ModEntities.SWIFTSTICK_BROOM, SwiftstickBroomEntityRenderer::new);
        GeoItemRenderer.registerItemRenderer(ModItems.SWIFTSTICK_BROOM, new SwiftstickBroomItemRenderer());

        EntityRendererRegistry.register(ModEntities.WOODSHADE_BROOM, WoodShadeBroomEntityRenderer::new);
        GeoItemRenderer.registerItemRenderer(ModItems.WOODSHADE_BROOM, new WoodShadeBroomItemRenderer());
    }
}
