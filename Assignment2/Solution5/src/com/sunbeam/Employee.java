package com.sunbeam;

public class Employee {
	private int id;
	private double salary;
	public Employee()
	{
		
	}
	public Employee(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
