package com.Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
	public static void main(String[] args) {
		int[] arr=new int[] {2,3,4,3,4,3,3,3,3,3,4,2,4,4};
		int res= majorityElements(arr);
		System.out.println(res);
	}
	
	public static int majorityElements(int [] arr) {
		/*int length=arr.length;							// This approach would take O(n) time and O(n) space
		int count=1;
		int maxValue=0;
		int key=0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<length;i++) {
			if(map.containsKey(arr[i])) {
				int num=map.get(arr[i]);
				num++;
				map.put(arr[i],num);
			}else {
			map.put(arr[i],count);
			}
		}
		for(int i:map.keySet()) {
			if(maxValue<map.get(i)) {
				maxValue=map.get(i);
				key=i;
			}
		}
		return key;*/
		
		int length=arr.length;
		int maj=0;
		int count=0;
		for(int i=0;i<length;i++) {
			if(count==0) {
				maj=arr[i];
			}
			if(arr[i]==maj) {
				count++;
			}else {
				count--;
			}
			
			
		}
		return maj;
	}
}
