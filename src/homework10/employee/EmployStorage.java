package homework10.employee;

import Tester.Book;

import java.util.Scanner;

public class EmployStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = value;
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
    public Employee getEmployeeById(String employeeID) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getEmployeeID().contains(employeeID)) {
             return employee;
            }
        }
        return null ;
    }

    public void searchByCompany(String companyName) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getCompany().toLowerCase().contains(companyName.toLowerCase())) {
                System.out.println(employee);
            }
        }
    }













}



