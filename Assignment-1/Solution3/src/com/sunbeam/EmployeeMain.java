package com.sunbeam;

import java.util.Scanner;

public class EmployeeMain {
	public static int idsearch1(Employee arr[], int size, int key) {

		for (int i = 0; i < size; i++) {
			if(arr[i].getEmpid()==key)
				return 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		Employee[] e = new Employee[1];
		for (int i = 0; i < e.length; i++) {
			e[i] = new Employee();
			e[i].accept();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id to be searched");
		int id = sc.nextInt();
		//int key = 0;
		int index = idsearch1(e, e.length, id);
		System.out.println(index);
		if (index == 1)
			System.out.println("key is found at index:" + index);
		else
			System.out.println("key is not found");
	}

	private static int idsearch(Employee[] arr, int length, int key) {
		// TODO Auto-generated method stub
		return 0;
	}

}
