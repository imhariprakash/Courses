package com.company;

import java.util.ArrayList;

public class Mkdir {

    private static boolean createIfNotExists = false;

    private Mkdir() {
    } // Prevents instantiation of this class

    public static boolean getCreateIfNotExists() {
        return (createIfNotExists);
    }

    public static void setCreateIfNotExists(boolean createIfNotExists) {
        Mkdir.createIfNotExists = createIfNotExists;
    }

    public static  void mkdir(ArrayList<String> strings) {
        if (strings.get(0).equals("-p")){
            setCreateIfNotExists(true);
            strings.remove(0);
        }

        for(String string : strings) {
            if (string.contains("/")) {
                String[] temp_directories = string.split("/");
                String fileName = temp_directories[temp_directories.length - 1];
                ArrayList <String> directories = getArrayList(temp_directories);
                Folder path = Paths.getRoot();
                boolean flag = true;
                for(String directory : directories){
                    if(directory.equals("") || directory == null){
                        continue;
                    }
                    if((!path.containsFolder(directory)) && createIfNotExists){
                        FileSystem.createFolder(path, directory); // Create folder if it doesn't exist
                        path = path.getFolder(directory);
                    }
                    else if(path.containsFolder(directory)){
                        path = path.getFolder(directory);
                    }
                    else{
                        ErrorHandler.FolderNotFound("mkdir: cannot create directory '" + string +"': No such file or directory");
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    FileSystem.createFolder(path, fileName);
                }
            }
            else{
                FileSystem.createFolder(string);
            }
        }

        setCreateIfNotExists(false);
    }

    public static ArrayList<String> getArrayList(String[] strings){
        ArrayList<String> arrayList = new ArrayList<String>();
        for(int i = 0; i < strings.length - 1; i++){
            arrayList.add(strings[i]);
        }
        return(arrayList);
    }
}
