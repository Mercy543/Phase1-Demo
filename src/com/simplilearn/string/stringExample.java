package com.simplilearn.string;

public class stringExample {

	public static void main(String[] args) {
		// literal String
		
		String name ="NOAH";
		String firstName ="NOAH";
		System.out.println("The name is:" + name);  
		System.out.println("The first name is:" + firstName);
		
		if (name == firstName) {
			System.out.println("Both String have the same reference");
		}else System.out.println("Both Strings have different references");

	}

}
