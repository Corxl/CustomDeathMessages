package me.corxl.customdeathmessages;

import me.corxl.customdeathmessages.Listeners.DeathListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomDeathMessages extends JavaPlugin {

    public static CustomDeathMessages plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        this.getServer().getPluginManager().registerEvents(new DeathListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
