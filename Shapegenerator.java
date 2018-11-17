package com.arpita.oops;
import java.util.*;

public class Shapegenerator {

	
	public static void main(String[] args) {
		int count=0;
		
		Scanner ac=new Scanner(System.in);
		
		while(count<3){
		System.out.println("Enter your choice 1.Line 2.Rectangle 3.Cube\n");
		int choice=ac.nextInt();
		switch(choice){
		case 1:Line line=new Line();
		        line.draw();
		        break;
		        
		case 2:Rectangle rectangle=new Rectangle();
               rectangle.draw();
               break;
        
		  case 3:Cube cube=new Cube();
                 cube.draw();
                 break;
          default: System.out.println("Invalid Input");
      
		}
		count=count+1;
	}
	}
}