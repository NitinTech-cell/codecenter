package com.Array.search;

// the first element which is >=k (where k is element for which we need to find lower bound)
public class LowerBound {
	public static void main(String[] args) {
		int element=findLowerBound(new int[] {2,3,5,6,8,10,15,20},21);
		System.out.println(element);
	}
	
	public static int findLowerBound(int[] A,int B) {
		int length=A.length;
		int start=0;
		int end=length-1;
		int res=-1;
		if(B<A[start]) {
			return 0;
		}else if(B>A[length-1]) {
			return length;
		}
		while(start<=end) {
			int mid=(start+end)/2;
			if(A[mid]==B) {
				return mid;
			}else if(A[mid]>B) {
				end=mid-1;
			}else {
				start=mid+1;
				if(A[start]>B) {
					res=start;
				}
			}
			
		}
		
		return res;
	}
}
