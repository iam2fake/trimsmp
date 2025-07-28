package com.trimsmp.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;

public class BindCommand {
    public static void register(CommandDispatcher<ServerCommandSource> d) {
        d.register(CommandManager.literal("trimsmp")
            .then(CommandManager.literal("bind")
            .then(CommandManager.argument("player", EntityArgumentType.player())
            .then(CommandManager.argument("slot", StringArgumentType.word())
            .then(CommandManager.argument("trim", StringArgumentType.word())
            .executes(ctx -> {
                // TODO: bind logic
                ctx.getSource().sendFeedback(() -> "Trim bound", false);
                return 1;
            })))));    
    }
}
