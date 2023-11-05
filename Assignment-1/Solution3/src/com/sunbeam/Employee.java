package com.sunbeam;

import java.util.Scanner;

public class Employee {
	int empid;
	String name;
	double salary;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee() {

	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		empid = sc.nextInt();
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter salary");
		salary = sc.nextDouble();

	}

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

}
