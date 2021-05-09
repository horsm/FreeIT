package com.freeit.lesson9.Task36;

/*
Задание 36
Вывести список файлов и каталогов выбранного каталога на диске.
Файлы и каталоги должны быть распечатаны отдельно.
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Task36FileList {
    private static final String PATH = "d:/Films/";
    private static final ArrayList<String> directories = new ArrayList<>();
    private static final ArrayList<String> filles = new ArrayList<>();

    public static void main(String[] args) {

        getAllFilesDirectories(PATH);
        printFilesAndFolders();
    }

    private static void getAllFilesDirectories(String PATH) {
        File currentDir = new File(PATH);
        File[] files = currentDir.listFiles();
        try {
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        directories.add(file.getCanonicalPath());
                        getAllFilesDirectories(file.getCanonicalPath());
                    } else if (file.isFile()) {
                        filles.add(file.getCanonicalPath() + ", размер файла: " + file.length()/1024 +" Кбит");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printFilesAndFolders() {
        System.out.println("Файлы: ");
        for (String fileName : filles) {
            System.out.println(fileName);
        }

        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("Каталоги: ");
        for (String directory : directories) {
            System.out.println(directory);
        }
    }
}

