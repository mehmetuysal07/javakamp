package com.example.hrms.business.abstracts;

import com.example.hrms.entites.concretes.Employer;

public interface EmployerValidationService {
	public void validate(Employer employer) throws Exception;
}
