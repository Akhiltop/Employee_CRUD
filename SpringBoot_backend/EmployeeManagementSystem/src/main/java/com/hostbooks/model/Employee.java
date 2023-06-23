package com.hostbooks.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	
	@NotBlank(message="First Name should not be null or empty or just white spaces")
	private String firstName;
	@NotBlank(message="Last Name should not be null or empty or just white spaces")
	private String lastName;
	@Email(message="Email address should be a valid one")
	private String emailId;
	
	
	
}
