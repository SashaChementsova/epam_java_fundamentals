package org.basics2.of.oop.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {
    private String name;

    private List<Directory> directoryList;

    private List<File> fileList;

    private Object getName;

    {
        name = "new_directory";
    }

    public Directory() {
    }

    public Directory(String name) {
        super();
        this.name = name;
    }

    public void addDirectory(Directory directory) {
        if (directoryList == null) {
            directoryList = new ArrayList<Directory>();
        }
        directoryList.add(directory);
    }

    public void addFile(File file) {
        if (fileList == null) {
            fileList = new ArrayList<File>();
        }
        fileList.add(file);
    }

    public void removeDirectory(String name) {
        for (Directory directory : directoryList) {
            if ((directory.getName()).equals(name));
            directoryList.remove(directory);
            break;
        }
    }

    public void removeFile(String name) {
        for (File file : fileList) {
            if ((file.getName()).equals(name));
            fileList.remove(file);
            break;
        }
    }

    public void rename (String newName) {
        setName(newName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Directory> getDirectoryList() {
        return directoryList;
    }

    public void setDirectoryList(List<Directory> directoryList) {
        this.directoryList = directoryList;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(directoryList, fileList, getName, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Directory other = (Directory) obj;
        return Objects.equals(directoryList, other.directoryList) && Objects.equals(fileList, other.fileList)
                && Objects.equals(getName, other.getName) && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "Directory [name=" + name + ", directoryList=" + directoryList + ", fileList=" + fileList + ", getName="
                + getName + "]";
    }
}
