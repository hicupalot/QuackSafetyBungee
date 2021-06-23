package com.quacktopia.quacksafetybungee;

import net.md_5.bungee.api.plugin.Plugin;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class QuackSafetyBungee extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.GOLD + "[QuackSaftey] QuackSaftey plugin booting up on v" + getDescription().getVersion());
        getServer().getPluginManager().registerEvents(new StaffJoinNotifier(), this);
        getCommand("slingshot").setExecutor(new StaffSlingshot());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
