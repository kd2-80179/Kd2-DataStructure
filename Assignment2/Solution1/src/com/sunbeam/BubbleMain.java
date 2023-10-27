package com.sunbeam;

import java.util.Arrays;

public class BubbleMain {
	public static void ImprovedBubbleSort(int arr[],int N)
	{
		int count=0;
		int passes=0;
		int flag;
		//counter no.of passes
		for(int i=1;i<N;i++) {
			passes++;
			flag=0;
		//compare two consecutive element
			for(int j=0;j<N-i;i++) {
				count++;
		//if left element is greater than right element	 then swap
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
					
				}
			}
			if(flag==0)
				break;
		}
		System.out.println("no of comparision:"+ count);
		System.out.println("no of passes :"+passes);
	}
	public static void main(String[] args) {
		int arr[]= {22,11,33,44,55,66,77};
		System.out.println("arrays before sort:"+Arrays.toString(arr) );
		ImprovedBubbleSort(arr,arr.length);
		System.out.println("Array after sort: "+ Arrays.toString(arr));
		
	}

}
