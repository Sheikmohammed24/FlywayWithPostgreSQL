package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CompanyDto;
import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	CompanyService service;
	
	@PostMapping("/save")
	public ResponseEntity<?> save (@RequestBody CompanyDto dto){
		ResponseEntity<?> obj = service.save(dto);
		return obj;
	}
	
	@GetMapping("/getAll")
	public List<Company> getAll(){
		
		return service.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<?> getById (@PathVariable int id){
		return service.getById(id);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody CompanyDto dto){
		ResponseEntity<?> obj = service.update(dto);
		return obj;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		service.delete(id);
		return "Deleted";
	}

}
