package com.Array;

//an element will be balancing element if after removing the element sum of even indexes and sum of odd indexes will be same
public class BalancingElement {
	public static void main(String[] args) {
		int[] arr= new int[] {2,6,4,4,7,3,6,7};
		boolean flag=checkBalancingElements(arr);
		System.out.println(flag);
		
	}
	
	/*public static boolean checkBalancingElements(int[] arr) {
		int length=arr.length;
		
		for(int i=0;i<length;i++) {
			int leftEvenSum=0;
			int leftOddSum=0;
			int rightEvenSum=0;
			int rightOddSum=0;
			for(int j=0;j<i;j++) {
				if(j%2==0) {
					leftEvenSum=leftEvenSum+arr[j];
				}else {
					leftOddSum=leftOddSum+arr[j];
				}
			}
			for(int k=i+1;k<length;k++) {
				if(k%2==0) {
					rightEvenSum=rightEvenSum+arr[k];
				}else {
					rightOddSum=rightOddSum+arr[k];
				}
			}
			if(leftEvenSum+rightOddSum==leftOddSum+rightEvenSum) {
				System.out.println(i);
				return true;
				
			}
		}
		return false;
	}*/
	
	//optimal approach
	public static boolean checkBalancingElements(int[] arr) {
		int length=arr.length;
		int prefixSumOdd[] = new int[length];
		int prefixSumEven[] = new int[length];
		int prefixSumE=0;
		int prefixSumO=0;
		for(int i=0;i<length;i++) {
			if(i%2==0) {
				prefixSumE=prefixSumE+arr[i];
				prefixSumEven[i]=prefixSumE;
				prefixSumOdd[i]=prefixSumO;
			}else {
				prefixSumO=prefixSumO+arr[i];
				prefixSumOdd[i]=prefixSumO;
				prefixSumEven[i]=prefixSumE;
			}
		}
		for(int j=1;j<length;j++) {
			int sumEven=prefixSumEven[j-1]+(prefixSumOdd[length-1]-prefixSumOdd[j]);
			int sumOdd=prefixSumOdd[j-1]+(prefixSumEven[length-1]-prefixSumEven[j]);
			if(sumEven==sumOdd) {
				return true;
			}
		}
		return false;
		
		
	}
}
