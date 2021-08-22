package com.Array;

public class MinimumAbsoluteDiff {
	public static void main(String[] args) {
		System.out.println(solve(new int[] {37, 19, 71, 72, 5, 4, 74, 2, 30, 33}));
		 //System.out.println(solve(new int[] {5, 17, 100, 11}));
		//System.out.println(solve(new int[] {37, 19, 71, 72, 5, 4, 74, 2, 30, 33, 85, 1, 7, 14, 98, 27, 51, 7, 24, 88, 86, 81, 77, 64, 13, 3, 63, 75, 29, 50, 90, 3, 22, 94, 40, 72, 75, 26, 32, 64, 62, 59, 19, 16}));
	}
	
	public static int solve(int[] A) {
        int length=A.length;
        
        int preDiff=Integer.MAX_VALUE;
        for(int i=0;i<length-1;i++){
            int diff=0;
            for(int j=i+1;j<length;j++){
                diff=Math.abs(A[i]-A[j]);
                if(diff<preDiff){
                    preDiff=diff;
                    
                }
                
            }
            
        }
        return preDiff;
    }
}
