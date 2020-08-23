package com.simplilearn.Array;

import java.util.Scanner;

public class CheckList{
	public static void main(String[] args) {
		int count =0;
		String myGroceries[] = {"Bread","Milk","Meat","Corn","Fish","Cereal","Water","Oil","Salt"};
		System.out.println("Welcome to CheckList");
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Item name :");
		String inpComp = input.nextLine();
		for (int i = 0; i < myGroceries.length; i++) {
			
			if (myGroceries[i].equals(inpComp)) {
				System.out.println("This Item is on your list ");
			count =1;
			};
			
		}
		if (count <=0) {
			System.out.println("This item is not on the List..Please buy this item from the store");
		}
	}

}
