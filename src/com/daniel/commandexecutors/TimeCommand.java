package com.daniel.commandexecutors;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Calendar cal = Calendar.getInstance();
		Player player = (Player) sender;

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy h:mm a"); // Output "10-20-2021 10:00 PM"
		String formattedDateTime = dateFormat.format(cal.getTime());

		player.sendMessage(ChatColor.RED + formattedDateTime);

		return false;
	}
}
