package com.example.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entites.concretes.UserActivationsByAdmin;

public interface UserActivationByAdminDao extends JpaRepository <UserActivationsByAdmin,Integer> {

}