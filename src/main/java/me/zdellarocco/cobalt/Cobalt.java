package me.zdellarocco.cobalt;

import me.zdellarocco.cobalt.commands.*;
import me.zdellarocco.cobalt.listeners.blockPlaceEvent;
import me.zdellarocco.cobalt.listeners.playerJoinMsg;
import me.zdellarocco.cobalt.listeners.playerLeaveMSG;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Cobalt extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic //
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_BLUE + "[Cobalt] " + ChatColor.BLUE + "Cobalt is now enabled");

        // Listeners //
        this.getServer().getPluginManager().registerEvents(new playerJoinMsg(), this); // Player Join Event
        this.getServer().getPluginManager().registerEvents(new playerLeaveMSG(), this); // Player Quit Event
        this.getServer().getPluginManager().registerEvents(new blockPlaceEvent(), this); // Block Place Event

        // Commands //
        Objects.requireNonNull(this.getCommand("credits")).setExecutor(new CreditCMD());
        Objects.requireNonNull(this.getCommand("mode")).setExecutor(new GamemodeCMD());
        Objects.requireNonNull(this.getCommand("modeall")).setExecutor(new modeAll());
        Objects.requireNonNull(this.getCommand("deltnt")).setExecutor(new delTNTCMD());
        Objects.requireNonNull(this.getCommand("chelp")).setExecutor(new helpCMD());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic //
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_BLUE + "[Cobalt] " + ChatColor.BLUE + "Cobalt is now disabled");
    }
}
