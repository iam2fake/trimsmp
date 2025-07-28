package com.trimsmp.config;

import com.google.gson.Gson;
import net.fabricmc.loader.api.FabricLoader;

import java.io.*;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

public class ConfigManager {
    private static Config config;
    public static void init() {
        var path = FabricLoader.getInstance().getConfigDir().resolve("trimsmp.json").toFile();
        Gson gson = new Gson();
        try {
            if (!path.exists()) {
                config = new Config();
                Writer w = new FileWriter(path);
                gson.toJson(config, w);
                w.close();
            } else {
                Reader r = new FileReader(path);
                Type type = new TypeToken<Config>(){}.getType();
                config = gson.fromJson(r, type);
                r.close();
            }
        } catch(IOException e) { e.printStackTrace(); }
    }
    public static Config get() { return config; }
}
