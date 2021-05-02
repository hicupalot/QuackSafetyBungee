package com.quacktopia.quacksafetybungee;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class StaffSlingshot implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("quacksafety.staff")) {
            String username = args[0];
            Player target = Bukkit.getServer().getPlayer(args[0]);
            if (args.length < 1) {
                sender.sendMessage(ChatColor.GOLD + "[QUACK]" + ChatColor.RED + "Please do /join (player)");
                return true;
            }
            Player p = (Player) sender;
            if (target == null) {
                sender.sendMessage(ChatColor.GOLD + "QUACK" + ChatColor.RED + "You must supply a valid Player");
                return true;
            }

        }
        return true;
    }
}