package com.daniel.commandexecutors;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.TabCompleter;
import org.bukkit.util.StringUtil;

public class FruitTab implements TabCompleter {

	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
		List<String> arguments = new ArrayList<>();

		// note that the command (aka /fruit) is args[0]

		// if user entered the first arg: /fruit then show these tab options
		if (args.length == 1) {
			String[] autoCompleteOptions = { "Apple", "Pear", "Banana" };
			return StringUtil.copyPartialMatches(args[0], Arrays.asList(autoCompleteOptions), new ArrayList<>());
		} else if (args.length == 2) {
			// if user already entered the 2nd argument, show these options.
			String[] autoCompleteOptions = { "Red", "Green", "Purple" };
			return StringUtil.copyPartialMatches(args[0], Arrays.asList(autoCompleteOptions), new ArrayList<>());
		}

		return arguments;
	}

}
