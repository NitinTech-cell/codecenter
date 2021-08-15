package com.Array;

//The pivot index/Equalibirium index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

//If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
public class EqualibiriumIndex {
	public static void main(String[] args) {
		System.out.println(pivotIndex(new int[] {1,7,3,6,5,6}));
	}
	
	public static int pivotIndex(int[] nums) {
       /* int length=nums.length;
        for(int i=0;i<length;i++){
            int leftSum=0;
            int rightSum=0;
            for(int j=i+1;j<length;j++){
                rightSum=rightSum+nums[j];
            }
            for(int k=0;k<=i-1;k++){
                leftSum=leftSum+nums[k];
            }
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;*/
	//optimal approach	
		 int length=nums.length;
	        int sum=0;
	        int leftSum=0;
	        int rightSum=0;
	        int[] prefixSum=new int[length];
	        for(int i=0;i<length;i++){
	            sum=sum+nums[i];
	            prefixSum[i]=sum;
	            
	        }
	        
	        for(int j=0;j<length;j++){
	            if(j==0){
	                leftSum=0;
	                rightSum=prefixSum[length-1]-prefixSum[j];
	            }else if(j==length-1){
	                leftSum=prefixSum[j-1];
	                rightSum=0;
	            }else{
	            leftSum=prefixSum[j-1];
	            rightSum=prefixSum[length-1]-prefixSum[j];
	            }
	            if(leftSum==rightSum){
	                return j;
	            }
	        }
	        return -1;
        
    }
}
