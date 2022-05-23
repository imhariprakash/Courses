package com.company;

import java.util.ArrayList;

public class Ls {
    private Ls(){
        // private constructor to avoid instantiated
    }

    public static void ls(){
        for(String file : Paths.getCurrentDirectory().getFiles().keySet()){
            if(file.contains(".")) {
                System.out.println(file);
            }
            else{
                System.out.println(file + ".blank" + " path: " + Paths.getCurrentDirectory().getFiles().get(file).getPath());
            }
        }

        for(String folder : Paths.getCurrentDirectory().getFolders().keySet()) {
            System.out.println(folder + " path: " + Paths.getCurrentDirectory().getFolders().get(folder).getPath());
        }
    }

    public static void ls(ArrayList<String> strings){
        ArrayList<String> folders = Cd.getArrayList(strings.get(0).split("/"));
        Folder currentFolder = Paths.getCurrentDirectory();
        Cd.cd(folders);
        ls();
        Paths.setCurrentDirectory(currentFolder);
        Paths.setCanonicalPath(currentFolder.getPath());
    }
}
