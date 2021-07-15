package com.example.salesOffice.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id	
	@Column
	private Long employeeId;
	@Column
	private String name;
	@Column
	private BigDecimal salary;
	@Column
	private Long branchID;

	/*public Employee(long employeeId, String name, BigDecimal salary, long branchID) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.branchID = branchID;
	}*/

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public void setBranchID(long branchID) {
		this.branchID = branchID;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public Long getBranchID() {
		return branchID;
	}

}
