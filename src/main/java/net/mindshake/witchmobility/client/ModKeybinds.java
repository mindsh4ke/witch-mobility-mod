package net.mindshake.witchmobility.client;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.mindshake.witchmobility.Main;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

public class ModKeybinds {
    public static final String BROOM_CONTROLS_CATEGORY_ID = "category.witchmobility.broomControls";
    public static final String BROOM_UP_KEYBIND_ID = "key.witchmobility.broomUp";
    public static final String BROOM_DOWN_KEYBIND_ID = "key.witchmobility.broomDown";

    public static KeyBinding broomUpKeyBind, broomDownKeyBind;

    public static void registerKeybinds () {
        Main.LOGGER.info("Registering mod keybinds");
        broomUpKeyBind = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                BROOM_UP_KEYBIND_ID,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_SPACE,
                KeyBinding.GAMEPLAY_CATEGORY
        ));

        broomDownKeyBind = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                BROOM_DOWN_KEYBIND_ID,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_LEFT_CONTROL,
                KeyBinding.GAMEPLAY_CATEGORY
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (broomUpKeyBind.isPressed()) {
                //TODO: Implement server packet broom control function
            }
        });
    }
}
