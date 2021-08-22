package com.Array.search;

////find the last occurance of an element in sorted array which contains duplicates
public class LastOccurance {
	public static void main(String[] args) {
		int index=findLastOccurance(new int[] {2,4,4,7,7,7,9,20,21},7);
		System.out.println(index);
	}
	
	public static int findLastOccurance(int[] arr,int element) {
		int start=0;
		int end=arr.length-1;
		int res=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==element) {
				res=mid;
				start=mid+1;
			}else if(arr[mid]>element) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return res;
	}
}

//time complexity will be O(logn)