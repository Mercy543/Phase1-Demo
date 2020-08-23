package com.simplilearn.collection;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeList {

	public static void main(String[] args) {
		
		
		
		Employee emp1 = new Employee(100,"John Snow",134.67,"V and V");
		Employee emp2 = new Employee(200,"Peter Craig",2534.95,"HR");
		Employee emp3 = new Employee(200,"Kelly Powers",563.01,"Insurance");
		Employee emp4 = new Employee(300,"Jim Powel",2964.51,"IT");
		
		//create List
		List<Employee> empList = new ArrayList<Employee>();
		
		//add employee to list
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		
		//iterate
		for(Employee emp:empList) {
			System.out.println("-----------------------------------------------");
			System.out.println("The Employee's ID is :" + emp.getEmpID());
			System.out.println("The Employee's name is :" + emp.getEmpNAme());
			System.out.println("The Employee's salary is :" + emp.getEmpSalary());
			System.out.println("The Employee 's department is :" + emp.getEmpDepartment());
		
		}
		
		

	}

}
