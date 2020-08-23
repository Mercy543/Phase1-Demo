package com.simplilearn.method.abstraction;

public class MainBank {

	public static void main(String[] args) {
		
		BankOfAmerica bom =new BankOfAmerica();
		Chase ch =new Chase();
		
		int balance =2500;
		
	float rateBroi =balance * bom.rateOfInterest(); 
    float rateRF = balance * bom.rateOfFixedDeposit();

    float rateBroi2 =balance * ch.rateOfInterest(); 
    float rateRF2 = balance * ch.rateOfFixedDeposit();
    
    System.out.println("Bank of America  rate of Interest is " + rateBroi);
    System.out.println("Bank of America interest Fixed deposite rate is " + rateRF);
    System.out.println("Chase rrate of interest is " + rateBroi2);
    System.out.println("Chase fixed deposite interest rate is " + rateRF2);
	}

}
