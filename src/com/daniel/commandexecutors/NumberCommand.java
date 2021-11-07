package com.daniel.commandexecutors;

import java.util.HashMap;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;

public class NumberCommand implements CommandExecutor {
	public static HashMap<String, String> numbersMap = getNumbersMap();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		// command with arguments.
		// example: /number args[0] args[1] arg[2] (String[] args)

		Player player = (Player) sender;

		if (args[0] == null) {
			player.sendMessage("Please add an argument to this command. Example: /number 1");
			return false;
		}

		String numberKey = args[0];
		String result = numbersMap.get(numberKey) != null ? numbersMap.get(numberKey) : "INVALID";
		player.sendMessage(result);

		return false;
	}

	public static HashMap<String, String> getNumbersMap() {
		HashMap<String, String> numbersMap = new HashMap<String, String>();
		numbersMap.put("1", "ONE");
		numbersMap.put("2", "TWO");
		numbersMap.put("3", "THREE");
		numbersMap.put("4", "FOUR");
		numbersMap.put("5", "FIVE");
		numbersMap.put("6", "SIX");
		numbersMap.put("7", "SEVEN");
		numbersMap.put("8", "EIGHT");
		numbersMap.put("9", "NINE");
		numbersMap.put("10", "TEN");

		return numbersMap;
	}

}
