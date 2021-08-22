package com.Array.search;


/*Given an array of integers A, find and return the peak element in it. An array element is peak if it is NOT smaller 
than its neighbors.For corner elements, we need to consider only one neighbor. We ensure that answer will be unique.
NOTE: Users are expected to solve this in O(log(N)) time.
*/

public class PeakElement {
	public static void main(String[] args) {
		int [] arr= new int[] {5,17,100,11};
		int element=findPeakElement(arr);
		System.out.println(element);
	}
	
	public static int findPeakElement(int[] arr) {
		return -1;
	}
}
