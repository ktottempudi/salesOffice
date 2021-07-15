package com.example.salesOffice.service;

import org.springframework.data.repository.CrudRepository;

import com.example.salesOffice.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
