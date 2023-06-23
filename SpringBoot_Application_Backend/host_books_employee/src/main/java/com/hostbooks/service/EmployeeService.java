package com.hostbooks.service;

import java.util.List;

import com.hostbooks.model.Employee;

public interface EmployeeService {
	
	
	
	public List<Employee> getAllEmployees();
	
	public Employee updateEmployee(Employee emp);
	
	public Employee deleteEmployee(Integer empId);
	
	public Employee getEmployeeByid(Integer empId);
	
	public Employee addEmployee(Employee emp);

}
