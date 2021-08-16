package me.zdellarocco.cobalt.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCMD implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player)sender;
            if(p.isOp() || p.hasPermission("cobalt.mode.change")) {
                if(!args[0].isEmpty()) {
                    switch (args[0]) {
                        case "0":
                            p.setGameMode(GameMode.SURVIVAL);
                            p.sendMessage(ChatColor.GREEN + "Your Game Mode is Now " + p.getGameMode() + "!");
                            break;
                        case "1":
                            p.setGameMode(GameMode.CREATIVE);
                            p.sendMessage(ChatColor.GREEN + "Your Game Mode is Now " + p.getGameMode() + "!");
                            break;
                        case "2":
                            p.setGameMode(GameMode.ADVENTURE);
                            p.sendMessage(ChatColor.GREEN + "Your Game Mode is Now " + p.getGameMode() + "!");
                            break;
                        case "3":
                            p.setGameMode(GameMode.SPECTATOR);
                            p.sendMessage(ChatColor.GREEN + "Your Game Mode is Now " + p.getGameMode() + "!");
                            break;
                        default:
                            p.sendMessage(ChatColor.RED + "" + ChatColor.ITALIC + "Unknown Game Mode.");
                            break;
                    }
                } else {
                    p.sendMessage(ChatColor.RED + "" + ChatColor.ITALIC + "No Game Mode Specified.");
                }
            } else {
                p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "[Cobalt] " + ChatColor.RED + "" + ChatColor.ITALIC + "You do not have permission to use this command.");
            }
        }
        return true;
    }

}
