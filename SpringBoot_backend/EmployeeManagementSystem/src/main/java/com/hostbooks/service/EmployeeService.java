package com.hostbooks.service;

import java.util.List;

import com.hostbooks.exception.EmployeeNotFoundException;
import com.hostbooks.exception.InvalidInputException;
import com.hostbooks.model.Employee;

public interface EmployeeService {
	
	
	
	public List<Employee> getAllEmployees() throws EmployeeNotFoundException;
	
	public Employee updateEmployee(Employee emp) throws InvalidInputException;
	
	public Employee deleteEmployeeById(Integer empId) throws EmployeeNotFoundException;
	
	public Employee getEmployeeById(Integer empId) throws EmployeeNotFoundException;
	
	public Employee addEmployee(Employee emp) throws InvalidInputException;

}
