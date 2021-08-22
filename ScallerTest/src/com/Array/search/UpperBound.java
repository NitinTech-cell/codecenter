package com.Array.search;

//first element which is >k (where k is element for which we need to find upper bound)
public class UpperBound {
	public static void main(String[] args) {
		int index=findUpperBound(new int[] {2,3,4,6,7,8,10,15},5);
		System.out.println(index);
	}
	
	public static int findUpperBound(int[] arr,int element) {
		int length=arr.length;
		int start=0;
		int end=length-1;
		int res=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(element==arr[mid]) {
				return arr[mid+1];
			}else if(arr[mid]>element) {
				end=mid-1;
			}else {
				start=mid+1;
				if(arr[mid+1]>element) {
					res=arr[mid+1];
				}
			}
			
		}
		return res;
	}
}
