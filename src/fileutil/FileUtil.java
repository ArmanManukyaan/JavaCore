package fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("please input folder path");
//        String folderPath = scanner.nextLine();
//        System.out.println("please input file Name");
//        String fileName = scanner.nextLine();
//        fileSearch(folderPath, fileName);

        System.out.println();
//
//        System.out.println("please input folder path");
//        String folderPath = scanner.nextLine();
//        System.out.println("please input keyword");
//        String keyword = scanner.nextLine();
//        contentSearch(folderPath, keyword);
//
//        System.out.println();
//
//        System.out.println("please input file path");
//        String filePath = scanner.nextLine();
//        System.out.println("please input keyword");
//        String keyword = scanner.nextLine();
//        findLines(filePath, keyword);

//        System.out.println();
//
//
//        System.out.println("please input folder path");
//        String folderPath = scanner.nextLine();
//        printSizeOfPackage(folderPath);

        System.out.println();


        System.out.println("please input folder path");
        String folderPath = scanner.nextLine();
        System.out.println("please input file name");
        String fileName = scanner.nextLine();
        System.out.println("please input content");
        String content = scanner.nextLine();
        createFileWithContent(folderPath, fileName, content);

    }

    public static void fileSearch(String folder, String fileName) {
        File folderFile = new File(folder);
        if (!folderFile.isDirectory()) {
            System.out.println("Wrong folder Path name");
            return;
        }
        File[] listOfFile = folderFile.listFiles();
        boolean isFound = false;
        for (File file : listOfFile) {
            if (file.isFile() && file.getName().contains(fileName)) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);
    }

    public static void contentSearch(String folder, String keyword) {
        File folderFile = new File(folder);
        if (!folderFile.isDirectory()) {
            System.out.println("Wrong folder Path name");
            return;
        }
        File[] lisFile = folderFile.listFiles();
        for (File file : lisFile) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                    String line = null;
                    while ((line = bufferedReader.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println(file);
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void findLines(String filePath, String keyword) {
        File file = new File(filePath);
        if (!file.exists() || !file.getName().endsWith(".txt")) {
            System.out.println("wrong file or file path!");
            return;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = null;
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(lineNumber + " " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printSizeOfPackage(String folderPath) {
        File folderFile = new File(folderPath);
        if (!folderFile.isDirectory()) {
            System.out.println("wrong file or file path!");
            return;
        }
        File[] files = folderFile.listFiles();
        long size = 0;
        for (File file : files) {
            if (file.isFile()) {
                size += file.length();
                System.out.println("size:" + size / 1024 + "KB ");
            }
        }
    }

    static void createFileWithContent(String folderPath, String fileName, String content) {
        File folderFile = new File(folderPath);
        if (!folderFile.isDirectory()) {
            System.out.println("wrong file or file path!");
            return;
        }
        File file = new File(folderFile, fileName);
        if (file.exists()) {
            System.out.println("file already exists");
            return;
        }
        try {
            boolean newFile = file.createNewFile();
            if (newFile) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
                    bufferedWriter.write(content);
                }
            }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }