package me.serverinfo.permissions;

import org.bukkit.command.CommandSender;

public class PermissionManager 
{

    public static boolean hasPermission(CommandSender player, String permission) 
    {
        return player.hasPermission(permission);
    }
}
