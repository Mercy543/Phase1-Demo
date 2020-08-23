package com.simplilearn.method.calculator;

public class InputData {
	
	public void Addition(Calculator calculator) 
	{
		if(calculator.getNumber1() > 0) 
		{
		
		int sum =calculator.getNumber1() + calculator.getNumber2();
		System.out.println("Addition of " + calculator.getNumber1()  + " and " + calculator.getNumber2() + "is " + sum);
		
		}
	}
	
	public void Subtraction(Calculator calculator) 
	{
		if(calculator.getNumber1() > 0) 
		{
		
		int sub =calculator.getNumber1() - calculator.getNumber2();
		System.out.println("Subtraction of " + calculator.getNumber1()  + " and " + calculator.getNumber2() + " is " + sub);
		
		}

}
	
	
	public void Multiplication(Calculator calculator) 
	{
		if(calculator.getNumber1() > 0) 
		{
		
		int mul =calculator.getNumber1() * calculator.getNumber2();
		System.out.println("Multiplication of " + calculator.getNumber1()  + " and " + calculator.getNumber2() + " is " + mul);
		
		}
	
	}
	
		public void Division(Calculator calculator) 
		{
			if(calculator.getNumber1() > 0) {
			
			int div =calculator.getNumber1() / calculator.getNumber2();
			System.out.println("Division of " + calculator.getNumber1()  + " and " + calculator.getNumber2() + " is " + div);
			
			}
	
	
	
	
	
	
	}
	

}

	
	
	
	
	