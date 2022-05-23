package com.company;


public class Main {
    public static void main(String[] args) {
        while(true){
            String canonicalPath = Paths.getCanonicalPath();
            System.out.print("LAPTOP-7URI6R0C: " + canonicalPath.substring(0,canonicalPath.length()) + " $ ");
            String command = UserInput.getString();
            if(command.equals("exit")){
                break;
            }
            else{
                CommandParser.parse(command);
            }
        }
    }
}
