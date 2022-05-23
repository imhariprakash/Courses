package com.company;

import java.util.Stack;

public class Paths {

    private static String canonical_path = "";

    private static Folder currentDirectory;
    private static Folder root; // root directory
    private static Stack<Folder> directoryStack =  new Stack<Folder>(); // stack of directories


    static{
        root = new Folder("~", true); // root directory
        root.setParent(null); // root has no parent
        currentDirectory = root;
        directoryStack.push(root); // push root directory to stack
        canonical_path = "~";

    }

    public static void setCanonicalPath(String path){
        canonical_path = path;
    }

    public static String getCanonicalPath(){
        return canonical_path;
    }

    public static void setCurrentDirectory(Folder directory){
        Paths.currentDirectory = directory;
    }

    public static Folder getCurrentDirectory(){
        return currentDirectory;
    }

    public static Folder getRoot(){
        return root;
    }

    public static void setDirectoryStack(){
        directoryStack.push(currentDirectory);
    }

    public static Folder popDirectoryStack(){
        return(directoryStack.pop());
    }

}
