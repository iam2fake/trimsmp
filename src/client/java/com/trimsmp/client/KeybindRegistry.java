package com.trimsmp.client;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class KeybindRegistry {
    public static KeyBinding ABILITY_1, ABILITY_2, ABILITY_3, ABILITY_4;
    public static void register() {
        ABILITY_1 = KeyBindingHelper.registerKeyBinding(
            new KeyBinding("key.trimsmp.ability1", GLFW.GLFW_MOUSE_BUTTON_3, "category.trimsmp")
        );
        ABILITY_2 = KeyBindingHelper.registerKeyBinding(
            new KeyBinding("key.trimsmp.ability2", GLFW.GLFW_KEY_KP_7, "category.trimsmp")
        );
        ABILITY_3 = KeyBindingHelper.registerKeyBinding(
            new KeyBinding("key.trimsmp.ability3", GLFW.GLFW_KEY_KP_8, "category.trimsmp")
        );
        ABILITY_4 = KeyBindingHelper.registerKeyBinding(
            new KeyBinding("key.trimsmp.ability4", GLFW.GLFW_KEY_KP_9, "category.trimsmp")
        );
    }
}
