package com.trimsmp.client;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.util.math.MatrixStack;

public class HUDRenderer {
    public static void register() {
        HudRenderCallback.EVENT.register(HUDRenderer::render);
    }
    private static void render(MatrixStack ms, float delta) {
        // TODO: draw icons and cooldown bars
    }
}
