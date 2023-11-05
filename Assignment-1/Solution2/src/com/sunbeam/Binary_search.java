package com.sunbeam;

import java.util.Scanner;

public class Binary_search {
	public static int binarySearch(int arr[], int size, int key) {
		int count = 0;
		int left = 0, right = size - 1, mid;
		while (left <= right) {
			count++;
			mid = (left + right )/ 2;
			if (key == arr[mid]) {
				return count;
			} else if (key < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88 };
		Scanner sc = new Scanner(System.in);

		System.out.println("enter key to be searched");
		int key = sc.nextInt();
		int count = binarySearch(arr, arr.length, key);

		System.out.println("enter count=" + count);
	}
}
