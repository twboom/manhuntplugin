package me.Manhunt.core;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class Join implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] teamName) {
		if (label.equalsIgnoreCase("join")) {
			if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "An error occurred!");
			sender.sendMessage(ChatColor.RED + "Error 101");
			
			return true;
		};
		
		if (sender instanceof Player) {
			// Sender is player
			Player player = (Player) sender;
		
			if (player.hasPermission("join.use")) {
				// Player has permission
				
				
				player.sendMessage(ChatColor.LIGHT_PURPLE + "Joined that team!");
				return true;
			}
			
			
			else {
				// Player doesn't have permission
				player.sendMessage(ChatColor.RED + "You do not have permission!");
			}
		
		};
		return false;
};
return false;
};
};