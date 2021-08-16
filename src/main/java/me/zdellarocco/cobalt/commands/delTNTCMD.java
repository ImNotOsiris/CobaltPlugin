package me.zdellarocco.cobalt.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class delTNTCMD implements CommandExecutor {

    public boolean delTNT = false;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player){
            Player p = (Player)sender;

            if(!args[0].isEmpty()) {
                if(args[0].equalsIgnoreCase("false")) {
                    delTNT = false;
                    p.sendMessage(ChatColor.DARK_BLUE + "[Cobalt] " + ChatColor.BLUE + "TNT will no longer be removed.");
                } else if (args[0].equalsIgnoreCase("true")) {
                    delTNT = true;
                    p.sendMessage(ChatColor.DARK_BLUE + "[Cobalt] " + ChatColor.BLUE + "TNT will now be removed.");
                } else {
                    p.sendMessage(ChatColor.DARK_RED + args[0] + ChatColor.RED + " is not a valid argument.");
                }
            } else {
                p.sendMessage(ChatColor.RED + "Please add a true or false value.");
            }
        }

        return false;
    }
}
