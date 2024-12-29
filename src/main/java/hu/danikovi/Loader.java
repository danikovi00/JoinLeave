package hu.danikovi;

import hu.danikovi.commands.Commands;
import hu.danikovi.liseners.JavaJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Loader extends JavaPlugin {

    @Override
    public void onEnable() {
        saveConfig(); reloadConfig();
        getLogger().info("Plugin betöltött sikeresen, így minden fasza");
        getServer().getPluginManager().registerEvents(new JavaJoinEvent(),this);
        getCommand("jlreload").setExecutor(new Commands(this));
        getLogger().info("Levente itt járt (⓿_⓿) (xd)");
        getLogger().info("Asked?");
        getLogger().info("L");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("A plugin sikeresen kikapcsolt!");
        // Plugin shutdown logic
    }
}

