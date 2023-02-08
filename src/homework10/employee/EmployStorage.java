package homework10.employee;

import Tester.Book;
public class EmployStorage {
    private Employee[] array = new Employee[10];
    private int size = 0;
    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }
    public void extend() {
        Employee result[] = new Employee[array.length + 10];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        array = result;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }
    public void searchByID(String employeeID) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if(employee.getEmployeeID().toLowerCase().contains(employeeID.toLowerCase())){
                System.out.println(employee);
            }
        }
    }
    public void searchByCompany(String companyName) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if(employee.getCompany().toLowerCase().contains(companyName.toLowerCase())){
                System.out.println(employee);
            }

        }
    }
}
