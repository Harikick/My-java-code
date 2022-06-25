package com.mindgate.collection;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Employee;

public class EmployeeCollection {
	
	Employee employee = new Employee();
	
	private static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	
	public static ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public static void setEmployeeList(ArrayList<Employee> employeeList) {
		EmployeeCollection.employeeList = employeeList;
	}

	public boolean addEmployee(Employee employee) {
		boolean result = employeeList.add(employee);
		//employeeList.add(employee);
		return result;
	}
	public boolean updateName(int employeeId, String name) {
		for (Employee employee : employeeList) {
			if(employee.getEmployeeId()==employeeId) {
				employeeList.remove(employee.getName());
				employee.setName(name);
				return true;
				
			}
			
		}
		return false;
	}
	
	public boolean updateSalary(int employeeId , double salary) {
		for (Employee employee : employeeList) {
			if(employee.getEmployeeId()==employeeId) {
				employeeList.remove(employee.getSalary());
				employee.setSalary(salary);
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteEmployee(int employeeId) {
		for (Employee employee : employeeList) {
			if(employee.getEmployeeId()==employeeId) {
				employeeList.remove(employee);
				return true;
			}
		}
		return false;
	}
	
	public List<Employee> getAllEmployee(){
		
		return employeeList;
	}
	
	public Employee getSingleEmployee(int employeeId) {
		for (Employee employee : employeeList) {
			if(employee.getEmployeeId()==employeeId) {
				return employee;
			}
		}
		return null;
	}

	

}
