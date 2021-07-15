package com.example.salesOffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.salesOffice.entity.Branch;
import com.example.salesOffice.service.BranchRepository;

@RestController
public class BranchController {
	
	@Autowired
	BranchRepository repo;
	
	@GetMapping(value = "/getBranch")
	public Iterable<Branch> getBranch(){
		return repo.findAll();
	}
	
	@PostMapping(value = "/createBranch")
	public Iterable<Branch> createBranch(@RequestBody Branch branch){
		repo.save(branch);
		return repo.findAll();
	}
	
	@PutMapping(value = "/updateBranch")
	public Iterable<Branch> updateBranch(@RequestBody Branch branch){
		repo.save(branch);
		return repo.findAll();
	}
	
	@DeleteMapping(value = "/deleteBranch/{branchId}")
	public Iterable<Branch> deleteBranch(@PathVariable("branchId") Long branchId){
		repo.deleteById(branchId);
		return repo.findAll();
	}

}
