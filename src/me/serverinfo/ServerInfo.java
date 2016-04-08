package me.serverinfo;

import me.serverinfo.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerInfo extends JavaPlugin {

    public static ServerInfo plugin;

    @Override
    public void onLoad() {
        ServerInfo.plugin = this;
    }

    @Override
    public void onEnable() 
    {
        //Default load operation
        getConfig().options().copyDefaults(true);
        saveConfig();
        getLogger().info("ServerInfo has been enabled! (V2.0.0)");
        
        //Registering base command.
        this.getCommand("admininfo").setExecutor(new C_admininfo(plugin));
        this.getCommand("owner").setExecutor(new C_owner(plugin));
        this.getCommand("ruleinfo").setExecutor(new C_ruleinfo(plugin));
        this.getCommand("website").setExecutor(new C_website(plugin));
        
        //Registering aliases
        this.getCommand("ai").setExecutor(new C_admininfo (plugin));
        
        //Usages
        this.getCommand("admininfo").setUsage("/admininfo");
        this.getCommand("ai").setUsage("/ai");
    }

    @Override
    public void onDisable() 
    {
        saveConfig();
        getLogger().info("ServerInfo has been disabled! (V2.0.0)");
    }
}
