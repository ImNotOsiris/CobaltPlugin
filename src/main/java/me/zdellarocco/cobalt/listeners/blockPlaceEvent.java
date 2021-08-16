package me.zdellarocco.cobalt.listeners;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import me.zdellarocco.cobalt.commands.delTNTCMD;

public class blockPlaceEvent implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        Block block = e.getBlock();
        Material material = block.getType();
        Player p = e.getPlayer();
        delTNTCMD deltnt = new delTNTCMD();

        if(material.equals(Material.TNT) && !p.isOp()) {
            block.setType(Material.AIR);
            p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You can not place that block.");
        }

    }

}
