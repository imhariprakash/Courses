package com.company;

import java.util.ArrayList;

public class Rmdir {
    private Rmdir() {
    } // Prevents instantiation of this class

    public static void rmdir(ArrayList<String> strings) {
        for(String string : strings) {
            if(Paths.getCurrentDirectory().containsFolder(string) && Paths.getCurrentDirectory().getFolder(string).isEmpty()) {
                FileSystem.removeFolder(string);
                System.out.println("Directory " + string + " removed");
            }
            else if(!Paths.getCurrentDirectory().containsFolder(string)){
                System.out.println("rmdir: cannot remove '" + string + "': No such file or directory");
            }
            else{
                System.out.println("rmdir: cannot remove '" + string + "': Directory not empty");
            }
        }
    }
}
