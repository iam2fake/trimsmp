package com.trimsmp;

import com.trimsmp.config.ConfigManager;
import com.trimsmp.command.CommandRegistrar;
import net.fabricmc.api.ModInitializer;

public class TrimsSMP implements ModInitializer {
    public static final String MODID = "trimsmp";

    @Override
    public void onInitialize() {
        ConfigManager.init();
        CommandRegistrar.register();
        System.out.println("[TrimsSMP] Initialized");
    }
}
