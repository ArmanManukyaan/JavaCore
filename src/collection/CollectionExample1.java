package collection;


import org.jetbrains.annotations.NotNull;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExample1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Arman");
        names.add("Aram");
        names.add("Karen");
        names.add("Gor");
        names.add("Gagik");

        searchForGivenNameList(names);
        System.out.println();
        deleteByNameByList(names);
        System.out.println();
        changIndexByName(names);
    }


    private static void changIndexByName(List<String> names) {
        System.out.println("index");
        String index = scanner.nextLine();
        System.out.println("Name");
        String addName = scanner.nextLine();
        names.add(Integer.parseInt(index), addName);
        System.out.println(names);
    }

    private static void deleteByNameByList(List<String> names) {
        System.out.println("Please input Name to delete list");
        String name = scanner.nextLine();
        System.out.println(names.remove(name));
        System.out.println(names);

    }

    private static void searchForGivenNameList(List<String> names) {
        System.out.println("Please input Name");
        String Name = scanner.nextLine();
        if (names.contains(Name)) {
            System.out.println(Name + " " + "found in the list of names.");
        } else {
            System.out.println(Name + " " + "not found in the list of names.");
        }
    }
}





