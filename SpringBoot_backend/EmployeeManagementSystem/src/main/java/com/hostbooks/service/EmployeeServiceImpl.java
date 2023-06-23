package com.hostbooks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostbooks.exception.EmployeeNotFoundException;
import com.hostbooks.exception.InvalidInputException;
import com.hostbooks.model.Employee;
import com.hostbooks.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	
	
	
	@Override
	public List<Employee> getAllEmployees() throws EmployeeNotFoundException{
		// TODO Auto-generated method stub
		List<Employee> employees=employeeDao.findAll();
		
		if(employees.isEmpty()) {throw new EmployeeNotFoundException("No Employees are present the database");}
		
		return employees;
	}

	@Override
	public Employee updateEmployee(Employee emp) throws InvalidInputException{
		// TODO Auto-generated method stub
		
		Employee employee=null;
		
		try {
			
			employeeDao.save(emp);
			
			employee=emp;
			
		}catch(Exception e) {
			
			throw new InvalidInputException("Invalid updation details are provided for the employee");
			
		}
		
		return employee;
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeNotFoundException{
		// TODO Auto-generated method stub
		
		Employee emp=null;
		
		Optional<Employee> employee=employeeDao.findById(empId);
		
		if(!employee.isEmpty()) {
			
			emp=employee.get();
			
			employeeDao.delete(employee.get());
			
		}else {
			
			throw new EmployeeNotFoundException("No Employees is present with the provided employeeId");
			
		}
		
		return emp;
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeNotFoundException{
		// TODO Auto-generated method stub
		
		
		Employee emp=null;
		
		Optional<Employee> employee=employeeDao.findById(empId);
		
		if(employee.isEmpty()) {
			
			throw new EmployeeNotFoundException("No Employees is present with the provided employeeId");
			
		}else {
			
			emp=employee.get();
			
		}
		
		
		return emp;
	}

	@Override
	public Employee addEmployee(Employee emp) throws InvalidInputException{
		// TODO Auto-generated method stub
		
		Employee employee=null;
		
		try {
			
			employeeDao.save(emp);
			
			employee=emp;
			
			
		}catch(Exception e) {
			
			throw new InvalidInputException("Invalid employee details are provided");
			
		}
		
		return employee;
	}

	
	
	
}
