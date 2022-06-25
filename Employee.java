package com.mindgate.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mindgate.collection.EmployeeCollection;

import com.mindgate.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Krish",25000);
		Employee e2 = new Employee(102,"Sathish",12000);
		Employee e3 = new Employee(103,"Surya",15000);
		Employee e4 = new Employee(104,"Vasanth",12000);
		Employee e5 = new Employee(105,"Abhishek",14000);
		EmployeeCollection employeeCollection = new EmployeeCollection();
		employeeCollection.addEmployee(e1);
		employeeCollection.addEmployee(e2);
		employeeCollection.addEmployee(e3);
		employeeCollection.addEmployee(e4);
		employeeCollection.addEmployee(e5);
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		int id ;
		String name;
		double salary;
		String string;
		do {
		System.out.println("Menu\r\n"
				+ "1. Add New Employee\r\n"
				+ "2. Update Employee Name\r\n"
				+ "3. Update Employee Salary\r\n"
				+ "4. Delete Employee\r\n"
				+ "5. Get All Employees\r\n"
				+ "6. Get Single Employee\r\n\n"
				+ "Enter your choice");
		
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Add New Employee");
			System.out.println("Enter Employee ID");
			 id = s.nextInt();
			System.out.println("Enter Employee Name");
			 name = s1.nextLine();
			System.out.println("Enter Employee salary");
			 salary = s.nextDouble();
			Employee employee1 = new Employee(id,name,salary);
			
			boolean addEmployee = employeeCollection.addEmployee(employee1);
			if(addEmployee) {
				System.out.println("Employee Added succesfully");
				System.out.println(employee1);
			}
			else
				System.out.println("Enter valid credentials");
			break;
			
		case 2 :
			System.out.println("Update Employee Name");
			System.out.println("Enter employee id you want to change");
			id = s.nextInt();
			System.out.println("Enter Employee name want to update");
			name = s1.nextLine();
			boolean updateName = employeeCollection.updateName(id, name);
			if (updateName) {
				System.out.println("Your Name updated successfully");
				employeeCollection.getSingleEmployee(id);
				
			}
			else
				System.out.println("Employee number Id not exits");
			break;
		
		case 3:
			System.out.println("Update Employee Salary");
			System.out.println("Enter Employee id you want to change");
			id = s.nextInt();
			System.out.println("Enter Employee salary want to update");
			salary = s.nextDouble();
			boolean updateSalary = employeeCollection.updateSalary(id, salary);
			if(updateSalary) {
				System.out.println("Salary updated Successfully");
			}
			else
				System.out.println("Employee number Id not exits");
		default:
			break;
			
		case 4:
			System.out.println("Delete Employee");
			System.out.println("Enter Employee id you want to delete");
			id = s.nextInt();
			boolean deleteEmployee = employeeCollection.deleteEmployee(id);
			if (deleteEmployee) {
				System.out.println("Employee deleted Successfully");
			}
			else
				System.out.println("Employee number Id not exists");
			break;
			
		case 5:
			System.out.println("Get All emloyees");
			List<Employee> allEmployee = employeeCollection.getAllEmployee();
			System.out.println("Total Employees");
			for (Employee employee : allEmployee) {
				System.out.println(employee);
			}
			break;
		
		case 6:
			System.out.println("Get Single Employee");
			System.out.println("Enter employee id :");
			id = s.nextInt();
			Employee singleEmployee = employeeCollection.getSingleEmployee(id);
			if(singleEmployee!=null)
			System.out.println(singleEmployee);
			else
				System.out.println("Employee Does not Exists");
			
			break;
		}	
		System.out.println("Do you want to continue Yes/No");
		string = s.next();
		}
		
		while(string.equalsIgnoreCase("yes"));
		
		for (Employee l : EmployeeCollection.getEmployeeList()) {
			System.out.println(l);
		}
		
		
			
	}

}
