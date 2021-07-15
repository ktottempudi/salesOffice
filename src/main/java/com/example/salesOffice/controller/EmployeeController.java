package com.example.salesOffice.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.salesOffice.entity.Employee;
import com.example.salesOffice.service.EmployeeRepository;
import com.example.salesOffice.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository repo;
	
	@GetMapping(value ="/getEmployes")
	public Iterable<Employee> getEmployess() {
		//return employeeService.getAllEmployees();
		employeeService.getAllEmployees(repo.findAll());
		return repo.findAll();
	}
	
	@PostMapping(value ="/createEmployee")
	public Iterable<Employee> createEmployee(@RequestBody Employee employee) {
		//employeeService.createNewEmployee(employee);
		//return employeeService.getAllEmployees();
		repo.save(employee);
		return repo.findAll();
	}
	
	@PutMapping(value = "/updateEmployee")
	public Iterable<Employee> updateEmployee(@RequestBody Employee employee) {
		repo.save(employee);
		return repo.findAll();
	}
	
	@DeleteMapping(value = "/deleteEmployee/{employeeId}")
	public Iterable<Employee> deleteEmployee(@PathVariable("employeeId") Long employeeId) {
		repo.deleteById(employeeId);
		return repo.findAll();
	}

}
