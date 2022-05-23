package com.company;

import java.util.HashMap;

public class Folder extends File {

    private HashMap<String, Folder> folders = new HashMap<>();
    private HashMap<String, File> files = new HashMap<>();

    public Folder(String name) {
        super(name, true);
    }

    public Folder(String name, boolean isRoot) {
        super(name, true, isRoot);
    }

    public Folder(String name, Folder folder) {
        super(name, true, folder);
    }

    public void addFolder(Folder folder) {
        this.folders.put(folder.getName(), folder);
    }

    public void addFile(File file) {
        files.put(file.getName(), file);
    }

    public Folder getFolder(String name) {
        return this.folders.get(name);
    }

    public File getFile(String name) {
        return this.files.get(name);
    }

    public HashMap<String, Folder> getFolders() {
        return this.folders;
    }

    public HashMap<String, File> getFiles() {
        return this.files;
    }

    public boolean containsFolder(String name) {
        return this.folders.containsKey(name);
    }

    public boolean containsFile(String name) {
        return this.files.containsKey(name);
    }

    public void removeFolder(String name) {
        this.folders.remove(name);
    }

    public void removeFile(String name) {
        this.files.remove(name);
    }

    public boolean isEmpty() {
        return (this.folders.isEmpty() && this.files.isEmpty());
    }

}
