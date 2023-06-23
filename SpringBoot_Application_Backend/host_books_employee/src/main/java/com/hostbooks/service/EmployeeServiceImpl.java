package com.hostbooks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostbooks.model.Employee;
import com.hostbooks.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	
	
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> employees=employeeDao.findAll();
		
	
		return employees;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		Employee str=null;
		
		
		try {
			
			employeeDao.save(emp);
			
			str=emp;
			
		}catch(Exception e) {
			
			
			
		}
		
		return str;
	}

	@Override
	public Employee deleteEmployee(Integer empId) {
		// TODO Auto-generated method stub
		
		Employee emp=null;
		
		Optional<Employee> employee=employeeDao.findById(empId);
		
		if(!employee.isEmpty()) {
			
			emp=employee.get();
			
			employeeDao.delete(employee.get());
			
			
			
		}
		
		return emp;
	}

	@Override
	public Employee getEmployeeByid(Integer empId) {
		// TODO Auto-generated method stub
		
		
		Employee emp=null;
		
		Optional<Employee> employee=employeeDao.findById(empId);
		
		if(employee.isEmpty()) {
			
			return null;
			
		}else {
			
			
			emp=employee.get();
			
		}
		
		
		return emp;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		Employee str=null;
		
		try {
			
			employeeDao.save(emp);
			
			str=emp;
			
			
		}catch(Exception e) {
			
			
			
		}
		
		return str;
	}

	
	
	
}
