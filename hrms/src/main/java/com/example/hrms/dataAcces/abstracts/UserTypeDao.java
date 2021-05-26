package com.example.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entites.concretes.UserType;

public interface UserTypeDao extends JpaRepository<UserType,Integer> {

}