package com.Array;

import java.util.Arrays;

public class FindMissingNo {
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,5};
		int n=5;
		int missing =findMissing(arr,n);
		System.out.println(missing);
	}
	
	/*public static int findMissing(int[] A,int n) {     //--------------> time Complexity ->O(n)
		int sumExpected= n*(n+1)/2;
		int sumActual=0;
		for(int i=0;i<A.length;i++) {
			sumActual+=A[i];
		}
		return sumExpected-sumActual;
	}*/
	
	/*public static int findMissing(int[] A,int n) {        //---------------->time complexity-->O(nlogn)
		Arrays.sort(A);
		int missing=0;
		if(A[0]!=1) {
			return 1;
		}
		if(A[A.length-1]!=n) {
			return n;
		}
		for(int i=0;i<A.length-1;i++) {
			if(!(A[i+1]-A[i]==1)) {
				missing = A[i]+1;
			}
		}
		return missing;
	}*/
	public static int findMissing(int [] A, int n) {
		int xorN=0;
		int xorA=0;
		for(int i=1;i<=n;i++) {
			xorN=xorN^i;
		}
		System.out.println(xorN);
		for(int i=0;i<A.length;i++) {
			xorA=xorA^A[i];
		}
		System.out.println(xorA);
		System.out.println(1^2^3^5);
		return xorN^xorA;
	}
	
	
}
