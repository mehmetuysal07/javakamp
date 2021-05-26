package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entites.concretes.Employee;

public interface EmployeeService {

    DataResult<List<Employee>> getAll();
	Result register(Employee employee) throws Exception;
}