package collection;

import java.util.*;

public class CollectionExample2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        noRepetitionOfNamesList(names);
        System.out.println();

        Set<String> name = new TreeSet<>();
        sortedListOfName(name);
    }

    private static void  sortedListOfName (Set<String> name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Please input Name ");
            String nameSort = scanner.nextLine();
            name.add(nameSort);
        }
        System.out.println("sorted list of names.");
        System.out.println(name);
    }

    private static void noRepetitionOfNamesList(Set<String> names) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Please input Name ");
            String name = scanner.nextLine();
            names.add(name);
        }
        System.out.println("List of names without repetition");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

