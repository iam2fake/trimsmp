package com.trimsmp.client;

import net.fabricmc.api.ClientModInitializer;

public class TrimsSMPClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeybindRegistry.register();
        HUDRenderer.register();
        System.out.println("[TrimsSMP] Client Initialized");
    }
}
