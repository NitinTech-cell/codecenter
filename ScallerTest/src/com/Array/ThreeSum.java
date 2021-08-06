package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
       /* int length=nums.length;
        List <List<Integer>> list= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                for(int k=j+1;k<length;k++){
                    if((nums[i]+nums[j]+nums[k]==0)){
                    	List<Integer> num=new ArrayList<>();
                        num.add(nums[i]);
                        num.add(nums[j]);
                        num.add(nums[k]);
                        if(!list.contains(num)) {
                        	list.add(num);
                        }
                    }  
                }
            }
        }
        
        return list;*/
		Arrays.sort(nums);
		
		
		List<List<Integer>> list= new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			int l=i+1;
			int r= nums.length-1;
			while(l<r) {
				if(nums[i]+nums[l]+nums[r]==0) {
					List<Integer> num= new ArrayList<>();
					num.add(nums[i]);
					num.add(nums[l]);
					num.add(nums[r]);
					if(!list.contains(num)) {
					list.add(num);
					}
				}
				if(nums[i]+nums[l]+nums[r]>0) {
					r--;
				}
				else {
					l++;
				}
			}
			
		}
		return list;
    }
	
	public static void main(String[] args) {
		int[] arr= new int[] {-1,0,1,2,-1,-4};
		System.out.println(threeSum(arr));
	}
}
