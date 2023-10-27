package com.sunbeam;

import java.util.Arrays;

public class SelectionMain {
         public static void selectionSort(double arr[],int N) {
        	 for(int i=0;i<N-1;i++) {
        		 for(int j=i+1;j<N;j++) {
        		 if(arr[i]>arr[j]) {
        		double  temp=arr[i] ;
        			arr[i]=arr[j];
        			arr[j]=temp;
        			
        			
        		 }
        		 }
        		 
        		 
        	 }
         }
	public static void main(String[] args) {
		double arr[] = {2000,40000,6000,35000};
		System.out.println("Arrays before sort:"+ Arrays.toString(arr));
		selectionSort(arr,arr.length);
		System.out.println("Arrays after sort:"+ Arrays.toString(arr));
	}

}
