package homework10.employee;

import Tester.Book;

import java.util.Scanner;

public class EmployStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    public void extend() {
        Employee result[] = new Employee[employees.length + 10];
        for (int i = 0; i < size; i++) {
            result[i] = employees[i];
        }
        employees = result;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i] + " ");
        }
    }

    public void printByStatus(boolean isActive) {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == isActive){
                System.out.println(employees[i]);
            }
        }
    }

    public Employee getEmployeeById(String employeeID) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getEmployeeID().contains(employeeID)) {
                return employee;
            }
        }
        return null;
    }

    public void searchByCompany(String companyName) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getCompany().toLowerCase().contains(companyName.toLowerCase())) {
                System.out.println(employee);
            }
        }
    }


    public void searchBySalaryRange(double minPrice, double maxPrice) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= minPrice
                    && employee.getSalary() <= maxPrice) {
                System.out.println(employee);

            }

        }
    }
}



