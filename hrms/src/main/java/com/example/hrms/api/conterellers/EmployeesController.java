package com.example.hrms.api.conterellers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployeeService;
import com.example.hrms.entites.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

	EmployeeService employeeService;
	
	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/getall")
	public List<Employee> getAll(){
		return this.employeeService.getAll().getData();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Employee employee) throws Exception{
		this.employeeService.register(employee);
}
}