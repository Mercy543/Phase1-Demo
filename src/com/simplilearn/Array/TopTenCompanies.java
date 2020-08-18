package com.simplilearn.Array;

import java.util.Scanner;

public class TopTenCompanies {
	public static void main(String[] args) {
		int count =0;
		String toptenCompanies[] = {"Dell","Infosys","CP","HP","BHELL","EMC","BOA","BOS","SIEMENS"};
		System.out.println("Welcome to Top Ten COmpanies");
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your Company name");
		String inpComp = input.nextLine();
		for (int i = 0; i < toptenCompanies.length; i++) {
			
			if (toptenCompanies[i].equals(inpComp)) {
				System.out.println("Your company is listed in the top ten and position is: " + i+1);
			count =1;
			};
			
		}
		if (count <=0) {
			System.out.println("You company is not in the top 10 companies");
		}
	}

}
