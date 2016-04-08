package me.serverinfo.commands;

import me.serverinfo.ServerInfo;
import me.serverinfo.permissions.PermissionManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class C_website implements CommandExecutor
{

    public C_website(ServerInfo plugin)
    {     
    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings)
    {
        if (PermissionManager.hasPermission(cs, "serverinfo.default")) 
        {
	    Player p = (Player) cs;	
		p.sendMessage(ChatColor.BLUE + "Hello, " + p.getName() + " our website is ");
		p.sendMessage(ChatColor.BLUE + ServerInfo.plugin.getConfig().getString("admininfo"));
	}
        
        return true;
    }
}
