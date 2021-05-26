package com.example.hrms.business.abstracts;

import com.example.hrms.entites.concretes.Employee;

public interface EmployeeValidationService {
	public void validate(Employee employee) throws Exception;
}