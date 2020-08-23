package com.simplilearn.typecasting;

import java.util.Scanner;

public class TypeConversionBasedOnUserInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 1 and 100 : ");
		
		String userNumer =input.nextLine();
		
		int userIntValue =Integer.parseInt(userNumer);
		
		double userDoubleValue =Double.parseDouble(userNumer);
		
		long userLongValue =Long.parseLong(userNumer);
		
		System.out.println("Userinput as Integer: " + userIntValue);
		System.out.println("Userinput as Double: " + userDoubleValue);
		System.out.println("Userinput as Long: " + userLongValue);

	}

}
