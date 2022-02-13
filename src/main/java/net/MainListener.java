package net;

import net.commands.MuteCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.*;

public class MainListener implements org.bukkit.event.Listener {

    MuteCommand plugin;

    public static Set<String> muted = new HashSet<String>();

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        String message = event.getMessage();
        Player p = event.getPlayer();

        if(muted.contains(p.getName())){
            event.setCancelled(true);
            p.sendMessage("Sorry you cant chat until get unmuted!");
        }
    }
}
