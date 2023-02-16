package homework10.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployStorage employStorage = new EmployStorage();
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        employeeMet();
    }


    public static void employeeMet() throws ParseException {

        boolean isRun = true;
        while (isRun) {
            printCommand();
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
                case "5":
                    searchEmployeeBySalaryRange();
                    break;
                case "6":
                    changPositionByEmployeeId();
                    break;
                case "7":
                    employStorage.printByStatus(true);
                    break;
                case "8":
                    inActiveEmployee();
                    break;
                case "9":
                    activeEmployee();
                    break;
            }
        }
    }

    private static void activeEmployee() {
        employStorage.printByStatus(false);
        System.out.println("please choose employeeId");
        String employeeId = scanner.nextLine();
        Employee employee = employStorage.getEmployeeById(employeeId);
        if (employee == null || employee.isActive()) {
            System.out.println("wrong employee Id or please try again");
        } else {
            employee.setActive(true);
            System.out.println("status chang!");
        }
    }

    private static void inActiveEmployee() {
        employStorage.printByStatus(true);
        System.out.println("please choose employeeId");
        String employeeId = scanner.nextLine();
        Employee employee = employStorage.getEmployeeById(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("wrong employee Id please try again");
        } else {
            employee.setActive(false);
            System.out.println("status chang!");
        }
    }

    private static void changPositionByEmployeeId() {
        employStorage.printByStatus(true);
        System.out.println("please choose employeeId");
        String employeeId = scanner.nextLine();
        Employee employee = employStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("wrong employee Id or employee is inactive.please ");
        } else {
            employee.setActive(false);
            System.out.println("position chang!");
        }
    }

    private static void searchEmployeeBySalaryRange() {
        System.out.println("pleas input minPrice,maxPrice");
        String salaryRangStr = scanner.nextLine();
        String[] salaryRang = salaryRangStr.split(",");
        double minPrice = Double.parseDouble(salaryRang[0]);
        double maxPrice = Double.parseDouble(salaryRang[1]);
        if (maxPrice < minPrice) {
            System.out.println("minPrice should be less then maxPrice");
            return;
        }
        employStorage.searchBySalaryRange(minPrice, maxPrice);
    }

    private static void printCommand() {
        System.out.println("input 0 for exit");
        System.out.println("input 1 add employee");
        System.out.println("input 2 print all employee");
        System.out.println("input 3 search employee by employee ID");
        System.out.println("input 4 search employee by company name");
        System.out.println("input 5 for search employee by salary range");
        System.out.println("input 6 for chang position");
        System.out.println("input 7 for print only active employees");
        System.out.println("input 8 for inactive employee by Id");
        System.out.println("input 9 for active employee by Id");
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

    static void addEmployee() throws ParseException {
        System.out.println("Please input name,surname,employeeId,salary,companyName,position,dateOfBirthday(dd/MM/yyyy)");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        String employeeDatum = employeeData[6];
        Date parse = sdf.parse(employeeDatum);


        Employee employeeID = employStorage.getEmployeeById(employeeId);
        if (employeeID == null) {
            Date date = new Date();
            String format = sdf.format(date);
            Employee employee = new Employee(employeeData[0], employeeData[1], employeeId,
                    Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5], format, parse);
            employStorage.add(employee);
            System.out.println("Employee was added!");
        } else {
            System.out.println("Employee with " + employeeID + " id already exists");

        }
    }


}





















