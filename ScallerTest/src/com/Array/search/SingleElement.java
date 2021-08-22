package com.Array.search;

//find single element in sorted array where all other element is duplicate
public class SingleElement {
	public static void main(String[] args) {
		int element=findSingleElement(new int[] {2,3,3,4,4,6,6,8,8,22,22});
		System.out.println(element);
	}
	
	//by using xor we can find the element but it will take O(n) time complexity
	/*public static int findSingleElement(int[] arr) {
		int length=arr.length;
		int res=0;
		for(int i=0;i<length;i++) {
			res=res^arr[i];
		}
		return res;
	}*/
	
	
	//this will take O(logn) time to execute
	public static int findSingleElement(int[] arr) {
		int length=arr.length;
		int res=-1;
		int start=1;
		int end=length-2;
		if(arr[0]!=arr[1]) {
			return arr[0];
		}else if(arr[length-1]!=arr[length-2]) {
			return arr[length-1];
		}
		while(start<=end) {
			int mid=(start+end)/2;
			int element=arr[mid];
			if(arr[mid+1]==element) {
				if(mid%2!=0) {
					end=mid-1;
				}else {
					start=mid+2;
				}
			}else if(arr[mid-1]==element) {
				if(mid%2!=0) {
					start=mid+1;
				}else {
					end=mid-2;
				}
			}else {
				return arr[mid];
			}
		}
		return arr[res];
}
}
