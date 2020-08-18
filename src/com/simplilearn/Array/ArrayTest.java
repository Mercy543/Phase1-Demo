package com.simplilearn.Array;

public class ArrayTest {
	
	public static void main(String[] args) {
		int [] numberList = {20,50,70,30,40};
		
		numberList [2] =33;
		
		for (int i = 0; i < numberList.length; i++) {
			
			System.out.println("The index  " +  i   +  "  contains value  " + numberList[i]);
			
			
		}
		
		System.out.println("---------------------------------");
		
		double numerList2[] = {20.3,3.2,2.9,7.3};
		
		for (int s = 0; s < numerList2.length; s++) {
			
			System.out.println("The index  " +  s   +  "  contains value  " + numerList2[s]);
		}
		
	}
	
	
}
