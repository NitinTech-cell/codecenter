package com.Array;

/*You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
Any answer with a calculation error less than 10-5 will be accepted.*/

public class MaximumAverageSubArray {
	public static void main(String[] args) {
		System.out.println(findMaxAverage(new int[] {1,12,-5,-6,50,3},4));
	}
	
	/*public static double findMaxAverage(int[] nums, int k) {
        int length=nums.length;
        double avg=-Double.MAX_VALUE;
        double preAvg=-Double.MAX_VALUE;
        for(int i=0;i<=length-k;i++){
            double sumk=0d;
            for(int j=i;j<k+i;j++){
                sumk=sumk+nums[j];
            }
            avg=sumk/k;
            if(avg>preAvg) {
            	preAvg=avg;
            	System.out.println(preAvg);
            }
            
        }
            return preAvg;
    }*/
	public static double findMaxAverage(int[] nums, int k) {
        int length=nums.length;
        int max=Integer.MIN_VALUE;
        int sumk=0;
        for (int i = 0; i < k; i++) {
        	sumk += nums[i]; 
        }
        max = Math.max(sumk, max);
        for(int i=k;i<length;i++){
        	sumk=sumk+nums[i]-nums[i-k];
        	 max = Math.max(sumk, max);
        }
        return (double) max / (double) k;
            
    }
}
