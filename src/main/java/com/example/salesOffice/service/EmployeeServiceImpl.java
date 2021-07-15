package com.example.salesOffice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.salesOffice.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private List<Employee> employess = new ArrayList<>();	
	
	@Override
	public void getAllEmployees(Iterable<Employee> iterable) {
		//employess.clear();
		//employess.add(new Employee(01, "John Doe", BigDecimal.valueOf(8000), 0001));
		//employess.add(new Employee(01, "John Smith", BigDecimal.valueOf(8000), 0002));
		/*for(Employee i : iterable) {
			System.out.println(i.getName());
		}*/
		iterable.forEach(i -> System.out.println(i.getName()));
		//List<String> uniqueNames = new ArrayList<String>();
		Set<String> uniqueNames = new HashSet<String>();
		iterable.forEach(i -> {
			/*if(uniqueNames.contains(i.getName()) == false) {
				uniqueNames.add(i.getName());
			}*/
			uniqueNames.add(i.getName());
		});
		System.out.println(uniqueNames);
		/*iterable.forEach(j -> {
			if(j.getName().equals("Michael Scott")) {
				//j.setName("Michael J. Scott");
				System.out.println("In for loop");
				System.out.println("Michael J. Scott");
			} else {
				System.out.println(j.getName());
			}
		});*/
		
		//iterable.forEach(i -> System.out.println(i.getName()));
		//return employess;
	}
	
	@Override
	public void createNewEmployee(Employee employee) {
		employess.add(employee);
		
	}

	@Override
	public void updateEmployeeInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeInfo() {
		// TODO Auto-generated method stub
		
	}
	

}
