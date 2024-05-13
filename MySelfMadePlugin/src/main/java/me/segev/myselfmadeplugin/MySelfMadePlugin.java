package me.segev.myselfmadeplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class MySelfMadePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("getping").setExecutor(new PingCommand());
    }
}
