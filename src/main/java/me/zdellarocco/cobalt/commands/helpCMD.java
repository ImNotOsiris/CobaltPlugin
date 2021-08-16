package me.zdellarocco.cobalt.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.*;
import net.md_5.bungee.api.chat.hover.content.Text;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class helpCMD implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player)sender;
            TextComponent msg = new TextComponent("zdellarocco");
            msg.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://github.com/zdellarocco"));
            msg.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("Visit GitHub.com")));
            BaseComponent[] component =
                new ComponentBuilder("[Cobalt] ").color(ChatColor.DARK_BLUE)
                    .append("Cobalt is a project developed and maintained by ").color(ChatColor.BLUE)
                    .append(msg).color(ChatColor.AQUA).bold(true)
                    .append(". Originally meant as a means to learn Java, it now serves as an Essentials replacement for their personal server.").color(ChatColor.BLUE).bold(false)
                    .create();

            p.spigot().sendMessage(component);
        }

        return false;
    }
}
