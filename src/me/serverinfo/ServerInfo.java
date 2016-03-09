package me.serverinfo;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerInfo extends JavaPlugin 
{
	@Override
	public void onEnable() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
		//Made it less advanced for people who do not know how to code java
		
		public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
			if (cmd.getName().equalsIgnoreCase("website")) {
				Player p = (Player)sender;	
				p.sendMessage(ChatColor.BLUE + "Hello, " + p.getName() + " our website is ");
				p.sendMessage(ChatColor.BLUE + getConfig().getString("web"));
				//To change the color change the "BLUE" to anything
			}
			if (cmd.getName().equalsIgnoreCase("ai")) {
				Player p = (Player)sender;	
				p.sendMessage(ChatColor.BLUE + "Hello, " + p.getName() + " our website is ");
				p.sendMessage(ChatColor.BLUE + getConfig().getString("admininfo"));
			}
			if (cmd.getName().equalsIgnoreCase("ruleinfo")) {
				Player p = (Player)sender;	
				p.sendMessage(ChatColor.BLUE + getConfig().getString("rulesinfo"));
			}
			if (cmd.getName().equalsIgnoreCase("owner")) {
				Player p = (Player)sender;	
				p.sendMessage(ChatColor.BLUE + getConfig().getString("owner"));
			}
			}
			return false;
	
	}
}
