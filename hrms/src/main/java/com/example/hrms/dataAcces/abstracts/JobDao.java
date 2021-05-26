package com.example.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entites.concretes.Job;

public interface JobDao extends JpaRepository <Job,Integer>{

}
