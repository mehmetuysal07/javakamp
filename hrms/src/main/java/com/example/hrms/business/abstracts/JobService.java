package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entites.concretes.Job;

public interface JobService {
	 DataResult <List<Job>> getAll();
	 Result add(Job job);
	}