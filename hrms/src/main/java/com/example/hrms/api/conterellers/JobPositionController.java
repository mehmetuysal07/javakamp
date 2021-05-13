package com.example.hrms.api.conterellers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobPositionService;
import com.example.hrms.entites.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionController {

	
	
	@Autowired
	private JobPositionService jobPositionService;
	
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return jobPositionService.getAll();
	}
}
