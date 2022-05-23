package com.company;

public class FileSystem {
    private FileSystem() {
        // private constructor to prevent instantiation
    }

    public static void createFile(String fileName) {
        if(!Paths.getCurrentDirectory().containsFile(fileName)) {
            Paths.getCurrentDirectory().addFile(new File(fileName));
            System.out.println("-rw-rw-r-- " + Touch.getDateTime() + " " + fileName);
        }
        else {
            Paths.getCurrentDirectory().getFile(fileName).setCreatedAt(); // set created at time
            System.out.println("-rw-rw-r-- " + Paths.getCurrentDirectory().getFile(fileName).getCreatedAt() + " " + fileName + " (updated time stamp) path : " + Paths.getCurrentDirectory().getFile(fileName).getPath());
        }
    }

    public static void createFolder(String folderName) {
        if(!Paths.getCurrentDirectory().containsFolder(folderName)) {
            Paths.getCurrentDirectory().addFolder(new Folder(folderName));
            System.out.println("drwxrwxr-x " + Touch.getDateTime() + " " + folderName + " path : " + Paths.getCurrentDirectory().getFolder(folderName).getPath());
        }
        else {
            Paths.getCurrentDirectory().getFolder(folderName).setCreatedAt(); // set created at time
            System.out.println("drwxrwxr-x " + Paths.getCurrentDirectory().getFolder(folderName).getCreatedAt() + " " + folderName + " (updated time stamp) path : " + Paths.getCurrentDirectory().getFolder(folderName).getPath());
        }
    }

    public static void createFolder(Folder folder, String folderName) {
        folder = new Folder(folderName, folder);
        System.out.println("drwxrwxr-x " + Touch.getDateTime() + " " + folderName + " path : " + folder.getPath());
    }

    public static void removeFolder(String folderName) {
        Paths.getCurrentDirectory().removeFolder(folderName);
    }


}
