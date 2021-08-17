package me.zdellarocco.cobalt.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class modeAll implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player) {
            Player p = (Player) sender;

            if(p.isOp() || p.hasPermission("cobalt.mode.all")) {
                if(!args[0].isEmpty()) {
                    switch(args[0]) {
                        case "0":
                            Bukkit.getOnlinePlayers()
                                    .stream()
                                    .filter(player -> !player.isOp())
                                    .forEach(pl -> pl.setGameMode(GameMode.SURVIVAL));
                            break;

                        case "1":
                            Bukkit.getOnlinePlayers()
                                    .stream()
                                    .filter(player -> !player.isOp())
                                    .forEach(pl -> pl.setGameMode(GameMode.CREATIVE));
                            break;

                        case "2":
                            Bukkit.getOnlinePlayers()
                                    .stream()
                                    .filter(player -> !player.isOp())
                                    .forEach(pl -> pl.setGameMode(GameMode.ADVENTURE));
                            break;

                        case "3":
                            Bukkit.getOnlinePlayers()
                                    .stream()
                                    .filter(player -> !player.isOp())
                                    .forEach(pl -> pl.setGameMode(GameMode.SPECTATOR));
                            break;
                    }
                } else {
                    p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Invalid GameMode.");
                }
            }

        }

        return false;
    }
}
