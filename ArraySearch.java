package com.arpita.java;

public class ArraySearch {
	public static void main(String[] args) {
		int a[]=new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int n=a.length;
		int k=14;
		int i;
		boolean flag=false;
		for(i=0;i<n;i++){
			if(k==a[i]){
				flag=true;
				break;
			}
			
		}
			if(flag==true)
			{
				System.out.println("the key is found! and at the position: "+i);
			}
			else{
				System.out.println("The key is not found");
			}
		}
}
