package com.simplilearn.typecasting;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//WAP to take a string value and convert into float,double and byte
		
		 Scanner Input =new Scanner(System.in);
		 
		 System.out.println("Enter a number between 1 and 100 : ");
		 
		 String sInput =Input.nextLine();
		 
		
		 byte bInput = Byte.parseByte(sInput);
		 
		 float fInput =Float.parseFloat(sInput);
		 
		 double dInput =Double.parseDouble(sInput);
		 
		 System.out.println("Original Number as String: " + sInput);
		 System.out.println("Original Number as byte: " + bInput);
		 System.out.println("Original Number as float: " + fInput);
		 System.out.println("Original Number as double: " + dInput);

	}

}
