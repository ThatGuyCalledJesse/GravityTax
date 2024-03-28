package com.jesse.gravitytax;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class GravityTax extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.broadcastMessage("[GT] GravityTax has been enabled!");
    }
}
