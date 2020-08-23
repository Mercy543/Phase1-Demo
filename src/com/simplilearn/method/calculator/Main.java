package com.simplilearn.method.calculator;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc =new Calculator(10,2);
		InputData dta = new InputData();
		
		dta.Addition(calc);
		
		dta.Division(calc);
		
		dta.Multiplication(calc);
		
		dta.Subtraction(calc);

	}

}
