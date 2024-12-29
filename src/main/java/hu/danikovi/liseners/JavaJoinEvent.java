package hu.danikovi.liseners;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JavaJoinEvent implements Listener {

    @EventHandler
    public void onjoin(PlayerJoinEvent event){
        Player player= event.getPlayer();
        event.joinMessage(Component.text("§a§lCsatlakozott "+ player.getName()+" a játékhoz!"));

    }
    @EventHandler
    public void leave(PlayerQuitEvent event){
        Player player= event.getPlayer();
        event.quitMessage(Component.text("§cKilépett "+ player.getName()+"!"));
    }
//    @EventHandler
//    public void firstjoin(Player)
}
