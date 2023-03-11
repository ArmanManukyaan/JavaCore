package collection;


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

        System.out.println("Please input Name");
        String Name = scanner.nextLine();
        if (names.contains(Name)) {
            System.out.println(Name + " " + "found in the list of names.");
        } else {
            System.out.println(Name + " " + "not found in the list of names.");
        }

        System.out.println();

        System.out.println("Please input Name to delete list");
        String name = scanner.nextLine();
        if (names.contains(name)) {
            System.out.println(name + " " + "found in the list of names:");
            System.out.println(name + " the name has been deleted the list " + names.remove(name));
        } else {
            System.out.println(name + " " + "not found in the list of names.");
        }
        System.out.println(names);

        System.out.println();

        System.out.println("index");
        String index = scanner.nextLine();
        System.out.println("Name");
        String addName = scanner.nextLine();
        names.add(Integer.parseInt(index), addName);
        System.out.println(names);
    }
}




