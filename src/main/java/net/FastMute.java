package net;

import net.commands.MuteCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class FastMute extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("fastmute").setExecutor(new MuteCommand());

        getServer().getPluginManager().registerEvents(new MainListener(), this);
    }

    @Override
    public void onDisable() {
    }
}
