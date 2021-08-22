package com.Array.search;

//find the first occurance of an element in sorted array which contains duplicates
public class FirstOccurance {
	public static void main(String[] args) {
		int index=findFirstOccurance(new int[] {2,4,7,7,7,7,9,20,20,21},20);
		System.out.println(index);
	}
	
	public static int findFirstOccurance(int[] arr,int element) {
		int start=0;
		int end=arr.length-1;
		int res=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==element) {
				res=mid;
				end=mid-1;
			}else if(arr[mid]>element) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return res;
	}
}

////time complexity will be O(logn)