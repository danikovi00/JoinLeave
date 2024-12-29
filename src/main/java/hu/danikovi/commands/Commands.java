package hu.danikovi.commands;

import hu.danikovi.Loader;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Commands implements CommandExecutor {
    String NoPerm="§cEhhez nincs jogod!";
    String Prefix="§a§lJoin§f§lLeave ";
    private Loader Plugin;
    public Commands(Loader Plugin){
        this.Plugin=Plugin;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(!(sender instanceof Player)){
            Bukkit.getLogger().info("Ezt csak a játékban használhatod!");
            return false;

        }
        if(!(sender.hasPermission("admin.reload"))){
            sender.sendMessage(NoPerm);
            return false;

        }
        Player player=(Player)sender;
        sender.sendMessage(Prefix+"§ePlugin újratöltése folyamatban...");
        Bukkit.getServer().getPluginManager().disablePlugin(Plugin);
        Bukkit.getServer().getPluginManager().enablePlugin(Plugin);
        sender.sendMessage(Prefix+"§aA plugin sikeresen újratöltve!");
        player.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, SoundCategory.MASTER, 100, 0);
        return true;
    }
}
