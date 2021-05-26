package com.example.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entites.concretes.Admin;

public interface AdminDao extends JpaRepository<Admin,Integer> {

}