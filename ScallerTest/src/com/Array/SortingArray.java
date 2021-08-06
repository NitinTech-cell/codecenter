package com.Array;

public class SortingArray {
	public static int[] sortedArray(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= new int[5];
		arr[0]=5;
		arr[1]=2;
		arr[2]=4;
		arr[3]=1;
		arr[4]=7;
		int[] arr1=sortedArray(arr);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
	}
}
