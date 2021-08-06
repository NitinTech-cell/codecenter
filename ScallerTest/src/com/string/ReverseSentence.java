package com.string;

import java.util.ArrayList;

public class ReverseSentence {
	public static void main(String[] args) {
		String str="blue the is sky";
		String finalStr=solve(str);
		System.out.println(finalStr);
	}
	
	
	    public static String solve(String A) {
	        int length=A.length();
	        String newStr="";
	        String finalStr="";
	        int count=0;
	        ArrayList<String> arr= new ArrayList<>();
	        for(int i=0;i<length;i++){
	            if(A.charAt(i)==' '|| i==length-1){
	                
	            	if(i==length-1) {
	                	newStr=newStr+A.charAt(i);
	                	arr.add(newStr);
	                }
	            	else if(count>0){
	                    count=0;
	                    arr.add(newStr);
	                    newStr="";
	                }
	            }else{
	                count++;
	                newStr=newStr+A.charAt(i);
	            }
	        }
	        for(int i=0;i<arr.size();i++){
	            String str=arr.get(arr.size()-1-i);
	            if(i==arr.size()){
	                finalStr=finalStr+str;
	            }else{
	            finalStr=finalStr+str+" ";
	            }
	            
	        }
	        return finalStr;
	    }
	
}
