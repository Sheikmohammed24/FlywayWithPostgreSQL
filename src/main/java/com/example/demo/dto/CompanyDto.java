package com.example.demo.dto;

import lombok.Data;

@Data
public class CompanyDto {
	
	private int id;
	private String company_name;
	private String location;
	private int employees;
	private int projects;
	private int clients;
	private int phno;
	private int profits;
}
