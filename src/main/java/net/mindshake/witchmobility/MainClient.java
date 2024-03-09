package net.mindshake.witchmobility;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.mindshake.witchmobility.client.renderer.entity.*;
import net.mindshake.witchmobility.registry.ModEntities;
import net.mindshake.witchmobility.screen.ModScreenHandlers;
import net.mindshake.witchmobility.screen.glyphtable.GlyphTableScreen;

public class MainClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //ModKeybinds.registerKeybinds(); TODO: Uncomment when development ends

        ScreenRegistry.register(ModScreenHandlers.GLYPH_TABLE_SCREEN_HANDLER, GlyphTableScreen::new);
        EntityRendererRegistry.register(ModEntities.BASIC_BROOM, BasicBroomEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.BLUE_BOTTLE_BROOM, BlueBottleBroomEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.SILVER_ARROW_BROOM, SilverArrowBroomEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.FIREBOLT_BROOM, FireboltBroomEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.SWIFTSTICK_BROOM, SwiftstickBroomEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.WOODSHADE_BROOM, WoodShadeBroomEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.GOLDENWOOD_BROOM, GoldenwoodBroomEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.SNOWAIR_BROOM, SnowairBroomEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.LEAFSHADE_BROOM, LeafshadeBroomEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.WINGS_BROOM, WingsBroomEntityRenderer::new);
    }
}
