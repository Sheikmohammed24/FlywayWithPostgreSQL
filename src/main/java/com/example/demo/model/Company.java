package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "company")
@AllArgsConstructor
@NoArgsConstructor
public class Company {
	
	@Id
	private int id;
	private String company_name;
	private String location;
	private int employees;
	private int projects;
	private int clients;
	private int phno;
	private int profits;

}
