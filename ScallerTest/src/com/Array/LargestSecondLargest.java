package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestSecondLargest {
	public static void main(String[] args) {
		/*ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(241, 710, 751, 904, 264, 955, 413, 163, 914, 173, 940));
		ArrayList<Integer> result=solve(arr);
		System.out.println(result);*/
		//int scndMax=(int)-10e9;
		double d= -10e9;
		System.out.println(d);
	}
	
	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
       
        
        int max=0;
        int scndMax=(int)-10e9;
        for(int i=0;i<A.size();i++) {
        	if(A.get(i)>max) {
        		scndMax=max;
        		max=A.get(i);
        		
        		
        }else if(A.get(i)>scndMax) {
        	scndMax=A.get(i);
        }
      }
        return new ArrayList<Integer>(Arrays.asList(max,scndMax));
    }
}
