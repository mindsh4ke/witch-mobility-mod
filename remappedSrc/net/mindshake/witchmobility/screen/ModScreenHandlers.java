package net.mindshake.witchmobility.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.screen.glyphtable.GlyphTableScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<GlyphTableScreenHandler> GLYPH_TABLE_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        GLYPH_TABLE_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(Main.MOD_ID, "mythril_blaster"),
                        GlyphTableScreenHandler::new);
    }
}
