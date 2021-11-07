package com.daniel.commandexecutors;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("MC COMMAND EXECUTORS PLUGIN ENABLED");

		getCommand("heal").setExecutor(new HealCommand());		
		getCommand("feed").setExecutor(new FeedCommand());
		getCommand("time").setExecutor(new TimeCommand());
		getCommand("number").setExecutor(new NumberCommand()); // this "number" command has args
		getCommand("consoleonly").setExecutor(new MyConsoleOnlyCommand()); // this command can only be accessed in console.
		
		getCommand("fruit").setExecutor(new FruitCommand()); // command with tab autocomplete for args
		getCommand("fruit").setTabCompleter(new FruitTab()); // add autocomplete (tab completion) for that command
	}
}
