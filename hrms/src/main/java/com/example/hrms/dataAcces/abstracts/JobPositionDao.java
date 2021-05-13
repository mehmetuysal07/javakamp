package com.example.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entites.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer>  {

}
