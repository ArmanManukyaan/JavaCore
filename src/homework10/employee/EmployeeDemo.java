package homework10.employee;

import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployStorage employStorage = new EmployStorage();

    public static void main(String[] args) {


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
                    addEmployee();
                    break;
                case "2":
                    employStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    System.out.println("please input company name");
                    String companyName = scanner.nextLine();
                    employStorage.searchByCompany(companyName);
                    break;
            }

        }

    }

    private static void getEmployeeById() {
        System.out.println("please input employeeID");
        String Id = scanner.nextLine();
        Employee employee = employStorage.getEmployeeById(Id);

        if (employee == null) {
            System.out.println("employee wait " + Id + " id dose not Id");
        } else {
            System.out.println(employee);
        }
    }
    static void addEmployee() {
        System.out.println("Please input name,surname,employeeId,salary,companyName,position");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employeeID = employStorage.getEmployeeById(employeeId);
        if (employeeID == null) {
            Employee employee = new Employee(employeeData[0], employeeData[1],
                    employeeId, Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5]);
            employStorage.add(employee);
            System.out.println("Employee was added!");
        } else {
            System.out.println("Employee with " + employeeID + " id already exists");
        }
    }
}