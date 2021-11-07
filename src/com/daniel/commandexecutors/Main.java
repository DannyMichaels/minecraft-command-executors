package com.daniel.commandexecutors;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("MC COMMAND EXECUTORS PLUGIN ENABLED");

		getCommand("heal").setExecutor(new HealCommand());
		getCommand("time").setExecutor(new TimeCommand());
		getCommand("number").setExecutor(new NumberCommand()); // this "number" command has args
	}
}
