package com.daniel.commandexecutors;

import java.util.List;
import java.util.ArrayList;

import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.TabCompleter;

public class FruitTab implements TabCompleter {

	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
		List<String> arguments = new ArrayList<>();

		if (args.length == 1) {
			arguments.add("Apple");
			arguments.add("Pear");
			arguments.add("Banana");
		} else if (args.length == 2) {
			arguments.add("Red");
			arguments.add("Green");
			arguments.add("Purple");
		}

		return arguments;
	}

}
