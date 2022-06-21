package com.example.demo.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CompanyDto;
import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepo;
import com.example.demo.service.CompanyService;

@Service
public class CompanyServiceImp implements CompanyService{
	@Autowired
	CompanyRepo repo;

	@Override
	public ResponseEntity<?> save(CompanyDto dto) {
		Company c = Company.builder().id(dto.getId()).company_name(dto.getCompany_name()).location(dto.getLocation())
				.employees(dto.getEmployees()).projects(dto.getProjects()).clients(dto.getClients()).phno(dto.getPhno())
				.profits(dto.getProfits()).build();
		c = repo.save(c);

		return ResponseEntity.ok("Created");
	}

	@Override
	public List<Company> getAll() {
		
		return repo.findAll();
	}

	@Override
	public ResponseEntity<?> getById(int id) {

		return ResponseEntity.ok(repo.findById(id).get());
	}

	@Override
	public ResponseEntity<?> update(CompanyDto dto) {
		Company c = Company.builder().id(dto.getId()).company_name(dto.getCompany_name()).location(dto.getLocation())
				.employees(dto.getEmployees()).projects(dto.getProjects()).clients(dto.getClients()).phno(dto.getPhno())
				.profits(dto.getProfits()).build();
		c = repo.save(c);
		return ResponseEntity.ok("Updated");
	}

	@Override
	public String delete(int id) {
		repo.deleteById(id);
		return "Deleted";
	}

	

}
