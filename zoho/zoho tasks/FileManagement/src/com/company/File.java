package com.company;
import java.util.Date;

public class File {
    private String name;
    private String path;

    private String createdAt;
    private Folder parent;

    public File(String name) {
        this.name = name;
        this.path = Paths.getCanonicalPath() + "/" + name;
        this.createdAt = Touch.getDateTime();
        this.parent = Paths.getCurrentDirectory();
        Paths.getCurrentDirectory().addFile(this);
    }

    public File(String name, boolean isFolder) {
        this.name = name;
        this.path = Paths.getCanonicalPath() + "/" + name;
        this.createdAt = Touch.getDateTime();
        this.parent = Paths.getCurrentDirectory();
    }

    public File(String name, boolean isFolder, Folder folder) {
        this.name = name;
        this.path = folder.getPath() + "/" + name;
        this.createdAt = Touch.getDateTime();
        this.parent = folder;
        folder.addFile(this);
    }

    public File(String name, boolean isFolder, boolean isRoot) {
        this.name = name;
        this.path = name;
        this.createdAt = Touch.getDateTime();
        this.parent = Paths.getCurrentDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt() {
        this.createdAt = Touch.getDateTime();
    }

    public Folder getParent() {
        return parent;
    }

    public void setParent(Folder parent) {
        this.parent = parent;
    }
}
