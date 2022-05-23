package com.company;

public class Tree {
    private Tree(){
        // private constructor to prevent instantiation
    }

    public static void tree(){
        getTree(Paths.getCurrentDirectory(), 0);
    }

    private static void getTree(Folder folder, int intendationLevel){
        for(File file : folder.getFiles().values()){
            for(int i = 0; i < intendationLevel; i++){
                System.out.print("\t");
            }
            System.out.print(file.getName());
            if(!file.getName().contains(".")){
                System.out.print(".blank");
            }
            System.out.println(" " + " path: " + file.getPath());
        }

        for(Folder subFolder : folder.getFolders().values()){
            for(int i = 0; i < intendationLevel; i++){
                System.out.print("\t");
            }
            System.out.println(subFolder.getName() + " path: " + subFolder.getPath());
            getTree(subFolder, intendationLevel + 1);
        }
    }
}
