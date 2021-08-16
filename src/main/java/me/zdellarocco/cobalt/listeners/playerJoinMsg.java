package me.zdellarocco.cobalt.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Bukkit.getServer;

public class playerJoinMsg implements Listener {

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent e) {
        getServer().broadcastMessage(ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "[Cobalt] " + ChatColor.BLUE + e.getPlayer().getDisplayName() + ChatColor.BLUE + " has joined the server.");
        e.setJoinMessage(null);
    }

}
