package com.example.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entites.concretes.Employer;

public interface EmployerDao extends JpaRepository <Employer,Integer> {

}