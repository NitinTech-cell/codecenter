package com.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
			list.add(5);
			list.add(3);
			list.add(1);
			list.add(5);
			list.add(1);
			list.add(3);
			list.add(4);
		int number = singleNumber(list);
		System.out.println(number);
	}
	
	public static int singleNumber(final List<Integer>A ) {   //5 3 1 5 1
		Map<Integer,Integer> map=new HashMap<>();
		int count1=0;
		int count2=0;
		for(int i=0;i<A.size();i++) {
			if(!map.containsKey(A.get(i))) {
				count1=count1+A.get(i);    //5+3+1
				map.put(A.get(i),1);
			}
			count2=count2+A.get(i); //5+3+1+5+1
			
		}
		return 2*(count1)-count2;
		/*int count=0;
		int value=0;
		for(int i=0;i<A.size();i++) {     //5 3 1 5 1
			for(int j=i+1;j<A.size();j++) {
				if(A.get(i)==A.get(j)) {
					count++;
					System.out.println(count);
				}
			}
			if(count==0) {
				value=A.get(i);
				return value;
			}
			
		}
		return value;*/
		
	}
}
