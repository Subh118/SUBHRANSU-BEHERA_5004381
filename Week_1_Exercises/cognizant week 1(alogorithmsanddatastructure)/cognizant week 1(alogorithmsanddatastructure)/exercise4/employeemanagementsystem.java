package exercise4;

public class employeemanagementsystem {
    private employee[] employees;
    private int count;

    public employeemanagementsystem(int capacity) {
        employees = new employee[capacity];
        count = 0;
    }

    public void addEmployee(employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
            System.out.println("Employee added: " + employee);
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    public employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                employees[i] = employees[count - 1]; // Move the last element to the deleted position
                employees[count - 1] = null; // Nullify the last element
                count--;
                System.out.println("Employee deleted: " + employeeId);
                return;
            }
        }
        System.out.println("Employee not found: " + employeeId);
    }

    public static void main(String[] args) {
        employeemanagementsystem ems = new employeemanagementsystem(10);

        employee emp1 = new employee(1, "Alice", "Manager", 75000);
        employee emp2 = new employee(2, "Bob", "Developer", 60000);

        ems.addEmployee(emp1);
        ems.addEmployee(emp2);

        System.out.println("Search Employee with ID 1: " + ems.searchEmployee(1));
        System.out.println("Traverse Employees:");
        ems.traverseEmployees();

        ems.deleteEmployee(1);
        System.out.println("Traverse Employees after deletion:");
        ems.traverseEmployees();
    }
}
