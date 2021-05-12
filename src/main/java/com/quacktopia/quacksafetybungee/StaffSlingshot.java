package com.quacktopia.quacksafetybungee;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.ServerConnectRequest;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StaffSlingshot implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("quacksafety.staff")) {
            String username = args[0];
            ProxiedPlayer target = ProxyServer.getInstance().getPlayer(args[0]);
            if (args.length <1){
                sender.sendMessage(ChatColor.GOLD+"[QUACK]" + ChatColor.RED + "/join (player)");
                return true;
            }
            if (args.length == 1) {
                Player p = (Player) sender;
                if (target == null) {
                    sender.sendMessage(ChatColor.GOLD + "[QUACK]" + ChatColor.RED + " You must supply a valid Player");
                    return true;
                }
                ProxiedPlayer ProxyPlayer = ProxyServer.getInstance().getPlayer(target.getUniqueId()); //Get Instance of a Player
                ProxyPlayer.connect((ServerConnectRequest) sender);
            }
            else{
                sender.sendMessage(ChatColor.GOLD+"[QUACK]" + ChatColor.RED+" You do not have permission to perform this");
            }
            return true;
        }
    return true;
    }
}