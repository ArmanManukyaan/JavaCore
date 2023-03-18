package fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(fileSearch());

        contentSearch();

        printSizeOfPackage();

        findLines();

        createFileWithContent();
    }

    public static boolean fileSearch() {
        String path = scanner.nextLine();
        String fileName = scanner.nextLine();
        File file = new File(path + "\\" + fileName);
        if (file.exists()) {
            return true;
        }
        return false;
    }

    public static void contentSearch() {
        String path = scanner.nextLine();
        String fileName = scanner.nextLine();
        File fileNam = new File(fileName);
        File file = new File(path);
        String[] list = file.list();
        for (String s : list) {
            if (s.contains(fileName)) {
                System.out.println("FileName " + s);

            }
        }
    }
    static void findLines() {
        String txtPath = scanner.nextLine();
        String keyword = scanner.nextLine();
        try (BufferedReader bw = new BufferedReader(new FileReader(txtPath))) {
            String line = "";
            while ((line = bw.readLine()) != null) {
                if (line.contains(keyword))
                    System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printSizeOfPackage() {
        long size = 0;
        String path = scanner.nextLine();
        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            for (File x : files) {
                if (x.isFile()) {
                    size += file.length();
                }
            }
            System.out.println("Folder size: " + size + " bytes");
        }
    }

    static void createFileWithContent() {
        String path = scanner.nextLine();
        String fileName = scanner.nextLine();
        String content = scanner.nextLine();
        File file = new File(path + "\\" + fileName);
        if (file.exists()) {
            System.out.println("file exists");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(content);
            } catch (IOException c) {
                c.printStackTrace();
            }
        }
    }
}


