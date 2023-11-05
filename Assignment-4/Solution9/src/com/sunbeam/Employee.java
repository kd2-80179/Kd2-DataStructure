package com.sunbeam;

import java.util.Scanner;

public class Employee {
	
	    int empId;
	    String name;
	    double salary;
	    Employee next;

	    public Employee(int empId, String name, double salary) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;
	        this.next = null;
	    }
	}

	class EmployeeLinkedList {
	    Employee head;

	    public void addEmployee(int empId, String name, double salary) {
	        Employee newEmployee = new Employee(empId, name, salary);
	        if (head == null) {
	            head = newEmployee;
	        } else {
	            Employee temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newEmployee;
	        }
	    }

	    public void displayEmployees() {
	        Employee temp = head;
	        while (temp != null) {
	            System.out.println("Employee ID: " + temp.empId + ", Name: " + temp.name + ", Salary: " + temp.salary);
	            temp = temp.next;
	        }
	    }

	    public Employee searchEmployeeByName(String name) {
	        Employee temp = head;
	        while (temp != null) {
	            if (temp.name.equals(name)) {
	                return temp;
	            }
	            temp = temp.next;
	        }
	        return null;
	    }

	    public void deleteEmployeeById(int empId) {
	        if (head == null) {
	            System.out.println("Employee list is empty.");
	            return;
	        }
	        if (head.empId == empId) {
	            head = head.next;
	            System.out.println("Employee with ID " + empId + " deleted successfully.");
	            return;
	        }
	        Employee temp = head;
	        while (temp.next != null && temp.next.empId != empId) {
	            temp = temp.next;
	        }
	        if (temp.next == null) {
	            System.out.println("Employee with ID " + empId + " not found.");
	        } else {
	            temp.next = temp.next.next;
	            System.out.println("Employee with ID " + empId + " deleted successfully.");
	        }
	    }

	    public void updateEmployeeSalary(int empId, double newSalary) {
	        Employee temp = head;
	        while (temp != null) {
	            if (temp.empId == empId) {
	                temp.salary = newSalary;
	                System.out.println("Salary updated successfully for employee with ID " + empId);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Employee with ID " + empId + " not found.");
	    }
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        EmployeeLinkedList employeeList = new EmployeeLinkedList();

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Display All Employees");
	            System.out.println("3. Search Employee by Name");
	            System.out.println("4. Delete Employee by ID");
	            System.out.println("5. Update Employee Salary");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Employee ID: ");
	                    int empId = scanner.nextInt();
	                    System.out.print("Enter Employee Name: ");
	                    String name = scanner.next();
	                    System.out.print("Enter Employee Salary: ");
	                    double salary = scanner.nextDouble();
	                    employeeList.addEmployee(empId, name, salary);
	                    System.out.println("Employee added successfully.");
	                    break;
	                case 2:
	                    System.out.println("All Employees:");
	                    employeeList.displayEmployees();
	                    break;
	                case 3:
	                    System.out.print("Enter Employee Name to search: ");
	                    String searchName = scanner.next();
	                    Employee foundEmployee = employeeList.searchEmployeeByName(searchName);
	                    if (foundEmployee != null) {
	                        System.out.println("Employee found - Employee ID: " + foundEmployee.empId +
	                                ", Name: " + foundEmployee.name + ", Salary: " + foundEmployee.salary);
	                    } else {
	                        System.out.println("Employee not found with the given name.");
	                    }
	                    break;
	                case 4:
	                    System.out.print("Enter Employee ID to delete: ");
	                    int deleteId = scanner.nextInt();
	                    employeeList.deleteEmployeeById(deleteId);
	                    break;
	                case 5:
	                    System.out.print("Enter Employee ID to update salary: ");
	                    int updateId = scanner.nextInt();
	                    System.out.print("Enter new Salary: ");
	                    double newSalary = scanner.nextDouble();
	                    employeeList.updateEmployeeSalary(updateId, newSalary);
	                    break;
	                case 6:
	                    System.out.println("Exiting the program. Goodbye!");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}


