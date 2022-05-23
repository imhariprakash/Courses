package com.company;

import java.util.ArrayList;

public class Commands {
    private Commands(){
        // private constructor to prevent instantiation
    }

    public static void command(String command, ArrayList <String> strings){

        if(strings.size() == 0 && command.equals("cd")){
            return;
        }

        if(command.contains("cd..") && strings.size() == 0){
            command = command.replace("cd..", "cd ..");
            for(String string : command.split(" ")) {
                strings.add(string);
            }
            command = "cd";
            strings.remove(0);
        }
        if(command.contains("cd~") && strings.size() != 0){
            command = command.replace("cd~", "cd ~");
            for(String string : command.split(" ")) {
                strings.add(string);
            }
            command = "cd";
            strings.remove(0);
        }
        if(command.contains("cd-") && strings.size() == 0){
            command = command.replace("cd-", "cd -");
            for(String string : command.split(" ")) {
                strings.add(string);
            }
            command = "cd";
            strings.remove(0);
        }

        switch(command){
            case "echo":
                Echo.echo(strings);
                break;
            case "cd":
                Cd.cd(strings);
                break;
            case "ls":
                if(strings.size() == 0) {
                    Ls.ls();
                }
                else{
                    Ls.ls(strings);
                }
                break;
            case "pwd":
                Pwd.pwd();
                break;
            case "touch":
                Touch.touch(strings);
                break;
            case "mkdir":
                Mkdir.mkdir(strings);
                break;
            case "tree":
                Tree.tree();
                break;
            case "rmdir":
                Rmdir.rmdir(strings);
                break;
            case "rm":
                break;
            default:
                    ErrorHandler.invalidMethod("'" + command + "'" + " is not recognized as an internal or external command,\noperable program or batch file.");
        }
    }

    public static void print(ArrayList <String> strings){
        for(String s : strings){
            System.out.println(s);
        }
    }
}
