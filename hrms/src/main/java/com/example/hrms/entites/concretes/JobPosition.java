package com.example.hrms.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Table;

import  javax.persistence.Id;

import lombok.Data;

@Data
@Entity
@Table(name = "job_positions")

public class JobPosition {
	
	@Id
	@GeneratedValue()
	@Column(name="id")
	private int id;
	
	@Column(name="position")
	private String position;
	
	public JobPosition () {
		
	}
}
