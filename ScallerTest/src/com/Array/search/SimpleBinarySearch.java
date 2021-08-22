package com.Array.search;

//time complexity for binary search will be O(logn) because every time we are reducing half part of the array
public class SimpleBinarySearch {
	public static void main(String[] args) {
		int index=search(new int [] {2,3,4,20,34,45,50,100,120},2);
		System.out.println(index);
	}
	
	public static int search(int[] arr,int element) {
		int length=arr.length;
		int mid=0;
		int start=0;
		int end=length;
		while(start<=end) {
			mid=(start+end)/2;
			if(element==arr[mid]) {
				return mid;
			}else if(arr[mid]>element) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
		
	}
}
