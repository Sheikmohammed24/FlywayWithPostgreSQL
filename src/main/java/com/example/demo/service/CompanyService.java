package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.dto.CompanyDto;
import com.example.demo.model.Company;

@Service
public interface CompanyService {
	
	public ResponseEntity<?> save (CompanyDto dto);
	
	public List<Company> getAll();
	
	public ResponseEntity<?> getById(int id);
	
	public ResponseEntity<?> update(CompanyDto dto);
	
	public String delete(int id);
		

}
