package com.arpita.java;

import java.util.Scanner;

public class MarkSheet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sub1,sub2,sub3;
		System.out.println("Enter sub1 marks");
		sub1=sc.nextInt();
		System.out.println("Enter sub2 marks");
		sub2=sc.nextInt();
		System.out.println("Enter sub3 marks");
		sub3=sc.nextInt();
        if(sub1>=60 && sub2>=60 && sub3>=60)
        {
        	System.out.println("Pass");
        }
        else if((sub1>=60 && sub2>=60)||(sub2>=60&&sub3>=60)||(sub3>=60&&sub1>=60))
        {
        	System.out.println("Promoted");
        }
        else
        {
        	System.out.println("fail");
        }

}
}
