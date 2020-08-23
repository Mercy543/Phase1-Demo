package com.simplilearn.accessmodifier;

class Person {
		
		private int age =40;
		
		protected double salary =12854.94;
		
		void showAge()
		{
			System.out.println("Age is:" + age);
		}
			
						
		
		public int getAge()
		{
			return age;
		}
		
		protected double getSalary()
		{
			return salary;
		}

}

public class AccessModifierDemo {

public static void main (String[] args){
	
	Person person  = new Person();
	
	System.out.println("The age is  :" + person.getAge());
	person.showAge();
	
	System.out.println("The Protected Salary is : " + person.salary);
	System.out.println("The Mthod Salary is  : " + person.getSalary());
	
}

}