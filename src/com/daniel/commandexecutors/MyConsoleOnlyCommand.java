package com.daniel.commandexecutors;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MyConsoleOnlyCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;
			player.sendMessage("This is a console only command! you can't use it");
		} else {
			String username = System.getProperty("user.name"); // will get the OS username
			System.out.println("Hello " + username + ", console command was successful!");
		}

		return false;
	}

}
