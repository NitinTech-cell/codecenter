package com.Array.search;

// for linear search time complexity will be O(n), we can not reduce more then that(if we can not sort the array)
//by using two pointer we can reduce to n/2 but it is almost n so we will count as O(n)
public class LinearSearch {
	public static void main(String[] args) {
		int index=search(new int [] {5,10,2,4,7,44,32},4);
		System.out.println(index);
	}
	
	/*public static int search(int[] arr,int element) {
		int length=arr.length;
		for(int i=0;i<length;i++) {
			if(element==arr[i]){
				return i;
			}
		}
		return -1;
		
	}*/
	
	//by using two pointer we can get O(n/2) which is almost O(n) so there is no impact
	public static int search(int[] arr,int element) {
		int length=arr.length;
		int count=0;
		for(int i=0;i<length;i++) {
			System.out.println(++count);
			if(arr[i]==element) {
				return i;
			}
			if(arr[length-i-1]==element) {
				return length-i-1;
			}
		}
		return -1;
		
	}
}
