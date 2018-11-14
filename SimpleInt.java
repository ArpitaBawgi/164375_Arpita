package com.arpita.java;
import java.util.Scanner;
public class SimpleInt {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("principle=");
		float p= sc.nextFloat();
		
		System.out.println("Time=");
		float t= sc.nextFloat();
		
		System.out.println("rate=");
		float r= sc.nextFloat();
		
		System.out.println("Simple Interest for the given values is:");
		
		float SI=(p*t*r)/100;
		
		System.out.println(SI);
		
		float compoundInterest= (float) (p*(Math.pow((1 + r / 100), t))); ;
		
		System.out.println("compond interest is:"+compoundInterest);
		}

}
