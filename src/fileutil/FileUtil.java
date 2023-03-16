package fileutil;

import java.io.File;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(fileSearch());

        contentSearch();

        printSizeOfPackage();
    }


    static boolean fileSearch() {
        String path = scanner.nextLine();
        String fileName = scanner.nextLine();
        File file = new File(path + "\\" + fileName);
        if (file.exists()) {
            return true;
        }
        return false;

    }

    static void contentSearch() {
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

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {

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

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {

    }


}
