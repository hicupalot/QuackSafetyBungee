package com.quacktopia.quacksafetybungee;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import org.bukkit.ChatColor;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerJoinEvent;
public class StaffJoinNotifier implements Listener {
    @EventHandler
    public void StaffJoin(PlayerJoinEvent e) {
        if (e.getPlayer().hasPermission("quacksafety.staff")){
            for (ProxiedPlayer all : ProxyServer.getInstance().getPlayers()) {
                if (all.hasPermission("quacksafety.staff")) {
                    all.sendMessage(new TextComponent( ChatColor.RED + "[STAFF]: " + e.getPlayer() + "just logged into Quacktopia on" + e.getPlayer().getServer()));
                }
            }
    }
}}
