package homework10.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployStorage employStorage = new EmployStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("input 0 for exit");
            System.out.println("input 1 add employee");
            System.out.println("input 2 print all employee");
            System.out.println("input 3 search employee by employee ID");
            System.out.println("input 4 search employee by company name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employeeID");
                    String employeeId = scanner.nextLine();
                    System.out.println("Please input salary");
                    String salary = scanner.nextLine();
                    System.out.println("Please input company name");
                    String company = scanner.nextLine();
                    System.out.println("Please input position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeId, Double.parseDouble(salary), company, position);
                    employStorage.add(employee);
                    System.out.println("Employee data has been created");
                    break;
                case "2":
                    employStorage.print();
                    break;
                case "3":
                    System.out.println("please input employeeID");
                    String employeeID = scanner.nextLine();
                    employStorage.searchByID(employeeID);
                    break;
                case "4":
                    System.out.println("please input company name");
                    String companyName = scanner.nextLine();
                    employStorage.searchByCompany(companyName);
                    break;
            }

        }

    }
}
