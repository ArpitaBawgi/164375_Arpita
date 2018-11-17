package com.arpita.java;

import java.util.Scanner;

public class Trynew {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		System.out.println("How many numbers ?");
		int n=ac.nextInt();
		int num[]=new int[n];
		
		System.out.println("enter the numbers");
		
		for(int i=0;i<num.length;i++){
			num[i]=ac.nextInt();
		}
		System.out.println("The given numbers are: ");
		for(int k=0;k<num.length;k++){
			System.out.println(num[k]);
		}
		
	}

}
