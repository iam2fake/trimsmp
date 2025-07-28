package com.trimsmp.command;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class CommandRegistrar {
    public static void register() {
        CommandRegistrationCallback.EVENT.register((disp, env, reg) -> {
            ClearCommand.register(disp);
            BindCommand.register(disp);
        });
    }
}
