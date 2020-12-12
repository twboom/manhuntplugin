package me.Manhunt.core;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		// Startup
		// Reloads
		// Plugin reload
		this.getCommand("Hello").setExecutor(new Join());
	}
	
	@Override
	public void onDisable() {
		// Shutdown
		// Reloads
		// Plugin reloads
	}

}
