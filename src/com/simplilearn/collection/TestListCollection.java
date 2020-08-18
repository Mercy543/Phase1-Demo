package com.simplilearn.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListCollection {

	public static void main(String[] args) {
		
	//syntax  List<data type> list = newArrayList();
		//create List
		
		List<String> empList = new ArrayList<>();
		
		//Add values to list
		empList.add("John Smith");
		empList.add("Paul young");
		empList.add("Mary Sailor");
		empList.add("Fred Rick");
		empList.add("Roland Kelly");
		
		System.out.println("Employee List:" + empList);
		System.out.println("-----------------------------------");
		
		//Iterate List
		
				System.out.println("------------Using Iterator Older method------------------------");

				Iterator<String> itr = empList.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());			
		}
				
			System.out.println("------------Using Enhanced forLoop------------------------");
				for(String empName:empList){
					System.out.println("Employee name :" + empName);
					}
				
			System.out.println("------------For loop with counter method------------------------");
			for (int i = 0; i < empList.size(); i++) {
				System.out.println("Employee name :" + empList.get(i));
				
			}
				
	}

}
