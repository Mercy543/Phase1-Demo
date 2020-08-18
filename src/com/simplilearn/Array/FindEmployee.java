package com.simplilearn.Array;

import java.util.Scanner;

public class FindEmployee {

	public static void main(String[] args) {
		int count =0;
		String compEmployee[] = {"Mike","Sandy","John","Noah","Mary","Will","Dora","Sam","Andy"};
		System.out.println("Welcome to ABC Company..where we know all our Employees");
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Emplyee name :");
		String inpComp = input.nextLine();
		for (int i = 0; i < compEmployee.length; i++) {
			
			if (compEmployee[i].equals(inpComp)) {
				System.out.println("This is an  Employee of ABC company");
			count =1;
			};
			
		}
		if (count <=0) {
			System.out.println("This  is not an Employee of ABC company");
		}

	}

}
