package com.simplilearn.method.abstraction;

public class BankOfAmerica implements Bank{

	@Override
	public float rateOfInterest() {
		
		return 5.2f;
	}

	@Override
	public float rateOfFixedDeposit() {
	
		return 11f;
	}

}
