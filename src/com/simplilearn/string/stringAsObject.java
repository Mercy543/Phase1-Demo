package com.simplilearn.string;

public class stringAsObject {

	public static void main(String[] args) {
		// string object
		String name = new String("NOAH");
		
		String firstName =new String("NOAH");
		System.out.println("The name is:" + name);  
		System.out.println("The first name is:" + firstName);
		
		System.out.println("------------------------------------------------------");
		if (name == firstName) {
			System.out.println("Both String have the same reference");
		}else System.out.println("Both Strings have different references");
	
		System.out.println("------------------------------------------------------");
	//sting methods
		char ch =name.charAt(2);
		System.out.println("The character at position 2 in NOAH is: " + ch);
		
		System.out.println("------------------------------------------------------");
		int ln =name.length();
		System.out.println("The length of the string  NOAH is:" + ln);
		
		for (int n = 0; n < name.length(); n++) {
			if ('A' == name.charAt(n)) 
			{
				System.out.println("Letter A exists");
				}
			else System.out.println("Letter A does not exist");
		};
	}

}
