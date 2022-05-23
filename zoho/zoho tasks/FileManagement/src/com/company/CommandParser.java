package com.company;

import java.util.ArrayList;

public class CommandParser {
    private CommandParser() {
        // private constructor to avoid being instantiated
    }

    public static void parse(String command) {
        if(command.equals("")) {
            return;
        }
        String method = command.split(" ")[0];
        Commands.command(method, parseToArray(command));
    }

    public static ArrayList<String> parseToArray(String command) {
        ArrayList<String> commandArray = new ArrayList<String>();
        String[] commandArrayString = command.split(" ");
        for (String s : commandArrayString) {
            commandArray.add(s);
        }
        commandArray.remove(0);
        return commandArray;
    }
}
