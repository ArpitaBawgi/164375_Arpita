package com.arpita.java;
import java.util.*;

public class Funcs {

	public static	void toAscend(int numbers[]){
		for(int l=0;l<numbers.length-1;l++)
		{
			for(int m=0;m<numbers.length-1-l;m++){
				if(numbers[m]>numbers[m+1]){
					int temp=numbers[m];
					numbers[m]=numbers[m+1];
					numbers[m+1]=temp;
				}
			}
		}
				
			}
		
	public static void toDescending(int numbers[])
	{
		for(int x=0;x<numbers.length-1;x++)
		{
			for(int m=0;m<numbers.length-1-x;m++){
				if(numbers[m+1]>numbers[m]){
					int temp=numbers[m+1];
					numbers[m+1]=numbers[m];
					numbers[m]=temp;
				}
			}
		}
	}
	
	public static void findBig(int numbers[]){
		toAscend(numbers);
		System.out.println("The biggest number is: "+numbers[numbers.length-1]);
	}
	
	public static void findSmall(int numbers[]){
		toAscend(numbers);
		System.out.println("The Smallest number is: "+numbers[0]);
	}
	
	
	
	
				public static void print(int numbers[]){
				for(int z=0;z<numbers.length;z++){
					System.out.println(numbers[z]);
				}
				//System.out.println("the biggest number is: "+numbers[0]);
				//System.out.println("the Smallest number is: "+numbers[numbers.length-1]);
			}
	
		
	
		public static void main(String[] args) {
			Scanner ac=new Scanner(System.in);
			System.out.println("How many numbers ?");
			int n=ac.nextInt();
			int numbers[]=new int[n];
			
			System.out.println("enter the numbers");
			
			for(int i=0;i<numbers.length;i++){
				numbers[i]=ac.nextInt();
			}
			System.out.println("The given numbers are: ");
			
			print(numbers);
			toAscend(numbers);
			System.out.println("The Ascending order: ");
			print(numbers);
			toDescending(numbers);
			System.out.println("The Descending Order: ");
			print(numbers);
			findBig(numbers);
			findSmall(numbers);
		
		}



}
