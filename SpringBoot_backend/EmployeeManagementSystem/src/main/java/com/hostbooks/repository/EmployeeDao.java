package com.hostbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostbooks.model.Employee;


@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	
	
	
	
}
