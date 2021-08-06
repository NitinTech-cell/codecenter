package com.Array;

public class MountainHeights {
	public static void main(String[] args) {
		int[] Height= new int[] {3,4,7,2,4,9,10,1,4,7};
		getHeight(Height);
	}
	
	public static void getHeight(int[] Height) {
		
		int[] left=new int[Height.length];
		int[] right=new int[Height.length];
		/*for(int i=0;i<Height.length-1;i++) {  //--------------------->O(n^2)
			int maxRight=0;
			int maxLeft=0;
			for(int j=i+1;j<Height.length;j++) {
				if(Height[j]>maxRight) {
					maxRight=Height[j];
				}
			}
			right[i]=maxRight;
			for(int k=i-1;k>=0;k--) {
				if(Height[k]>maxLeft) {
					maxLeft=Height[k];
				}
			}
			left[i]=maxLeft;
		}
		
		for(int i=0;i<right.length;i++) {
			System.out.print(right[i]+" ");
		}
		System.out.println();
		for(int i=0;i<left.length;i++) {
			System.out.print(left[i]+" ");
		}*/
		for(int i=1;i<Height.length;i++) {   //-------------------------->O(n)
			
			left[i]=Math.max(left[i-1],Height[i-1]);
		}
		for(int i=0;i<left.length;i++) {
			System.out.print(left[i]+" ");
		}
		System.out.println();
		for(int i=Height.length-2;i>=0;i--) {
			
			right[i]=Math.max(right[i+1],Height[i+1]);
		}
		for(int i=0;i<right.length;i++) {
			System.out.print(right[i]+" ");
		}
		
	}
	
}
