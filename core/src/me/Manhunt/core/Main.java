package me.Manhunt.core;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		// Startup
		// Reloads
		// Plugin reload
	}
	
	@Override
	public void onDisable() {
		// Shutdown
		// Reloads
		// Plugin reloads
	}
	
	// /hello <-- Hey Welcome!
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (label.equalsIgnoreCase("hello")) {
			if (sender instanceof Player) {
				// Sender is player
				Player player = (Player) sender;
				if (player.hasPermission("hello.use")) {
					player.sendMessage(ChatColor.LIGHT_PURPLE + "Hey player!");
					return true;
				}
				else {
					player.sendMessage(ChatColor.RED + "You do not have permission!");
				}
			}
			else {
				// Sender is console
				sender.sendMessage("Hey!");
				return true;
			}
		}
		
		return false;
	}

}
