package me.zdellarocco.cobalt.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import static org.bukkit.Bukkit.getServer;

public class playerLeaveMSG implements Listener {

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e) {
        getServer().broadcastMessage(ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "[Cobalt] " + ChatColor.BLUE + e.getPlayer().getDisplayName() + ChatColor.BLUE + " has left the server.");
        e.setQuitMessage(null);
    }

}
