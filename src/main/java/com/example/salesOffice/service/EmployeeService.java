package com.example.salesOffice.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.salesOffice.entity.Employee;

@Service
public interface EmployeeService {
	public void getAllEmployees(Iterable<Employee> iterable);
	public void createNewEmployee(Employee employee);
	public void updateEmployeeInfo();
	public void deleteEmployeeInfo();

}
