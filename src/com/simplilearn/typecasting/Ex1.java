package com.simplilearn.typecasting;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//WAP to take userinput as integer value and convert into float,double and byte
		
		 Scanner Input =new Scanner(System.in);
		 
		 System.out.println("Enter a number between 1 and 100 : ");
		 
		 int intNumber =Input.nextInt();
		 
		 float fNumber =intNumber;
		 
		 double dNumber =intNumber;
		 
		 byte bNumber =(byte)intNumber;
		 
		 
		 
		 System.out.println("Original Number as integer: " + intNumber);
		 System.out.println("Original Number as float: " + fNumber);
		 System.out.println("Original Number as double: " + dNumber);
		 System.out.println("Original Number as byte: " + bNumber);

	}

}
