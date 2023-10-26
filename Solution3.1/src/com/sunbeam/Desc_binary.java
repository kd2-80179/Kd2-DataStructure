
	package com.sunbeam;

	import java.util.Scanner;

	public class Desc_binary {
		public static int binarySearch(int arr[], int size, int key) {
			
			int left = 0, right = size - 1, mid;
			while (left <= right) {
	
				mid = (left + right )/ 2;
				if (key == arr[mid]) {
					return mid;
				} else if (key < arr[mid]) {
					right = mid +1;
				} else {
					left = mid - 1;
				}
			}
			//System.out.println(mi);
			return -1;
		}

		public static void main(String[] args) {
			int arr[] = {88,77,66,55,44,33,22,11 };
			Scanner sc = new Scanner(System.in);

			System.out.println("enter key to be searched");
			int key = sc.nextInt();
			int count = binarySearch(arr, arr.length, key);

			System.out.println("enter count=" + count);
		}
	

	

}

