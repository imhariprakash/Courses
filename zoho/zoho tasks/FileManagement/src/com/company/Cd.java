package com.company;

import java.util.ArrayList;

public class Cd {
    private Cd(){
        // private constructor to prevent instantiation
    }

    public static void cd(ArrayList<String> strings){

        ArrayList<String> jumps = getArrayList(strings.get(0).split("/")); // since cd only takes a single argument - neglecting the possibility of multiple arguments
        if(jumps.size() == 1){
            if(jumps.get(0).equals("-")){
                Paths.setDirectoryStack();
                Paths.setCurrentDirectory(Paths.popDirectoryStack());
                Paths.setCanonicalPath(Paths.getCurrentDirectory().getPath());
                return;
            }
            else if(jumps.get(0).equals("~")){
                Paths.setDirectoryStack();
                Paths.setCurrentDirectory(Paths.getRoot());
                Paths.setCanonicalPath(Paths.getCurrentDirectory().getPath());
                return;
            }
        }
        if(jumps.get(0).equals("~")){
            Paths.setDirectoryStack();
            Paths.setCurrentDirectory(Paths.getRoot());
            Paths.setCanonicalPath(Paths.getCurrentDirectory().getPath());
            jumps.remove(0);
        }
        for (String jump : jumps) {
            if (jump.equals("..") && (Paths.getCurrentDirectory().getParent() != null)) {
                Paths.setDirectoryStack();
                Paths.setCurrentDirectory(Paths.getCurrentDirectory().getParent());
                Paths.setCanonicalPath(Paths.getCurrentDirectory().getPath());
            }
            else if (jump.equals("..") && (Paths.getCurrentDirectory().getParent() == null)) {
                return;
            }
            else if(Paths.getCurrentDirectory().containsFolder(jump)){
                Paths.setDirectoryStack();
                Paths.setCurrentDirectory(Paths.getCurrentDirectory().getFolder(jump));
                Paths.setCanonicalPath(Paths.getCurrentDirectory().getPath());
            }
            else{
                System.out.println("bash : cd : " + strings.get(0) + " No such file or directory");
                return;
            }
        }
    }

    public static ArrayList<String> getArrayList(String[] strings){
        ArrayList <String> paths = new ArrayList<>();
        for(String str : strings){
            paths.add(str);
        }
        return(paths);
    }
}
