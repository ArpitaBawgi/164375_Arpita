package com.arpita.java;
import java.util.*;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,total;
		double avg;
		for(int i=1;i<=3;i++){
			
		String  name;
		System.out.println("Enter the student name");
		name=sc.next();
		System.out.println("Enter the marks of student");
		System.out.println("Enter the student1 A's marks: ");
		a=sc.nextInt();
		System.out.println("Enter the student1 B's marks: ");
		b=sc.nextInt();
		System.out.println("Enter the student1 C's marks: ");
		c=sc.nextInt();
		total=a+b+c/3;
		avg=total/3;
		System.out.println(" total = "+total);
		System.out.println(" avg"+avg);
		
		}

	}
}
