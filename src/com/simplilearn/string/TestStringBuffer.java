package com.simplilearn.string;

public class TestStringBuffer {

	public static void main(String[] args) {
		// string buffer threadsafe and slow and mutable
		
		StringBuffer name =new StringBuffer("John");
		name.append("Smith");
		System.out.println("Fullname is: " + name);
		
	

	}

}
