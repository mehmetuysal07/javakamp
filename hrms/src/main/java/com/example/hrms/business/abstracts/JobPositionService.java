package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entites.concretes.JobPosition;

public interface JobPositionService {

	
	List<JobPosition> getAll();
	
}
