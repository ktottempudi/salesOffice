package com.example.salesOffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.salesOffice.entity.Sales;
import com.example.salesOffice.service.SalesRepository;

@RestController
public class SalesController {
	
	@Autowired
	private SalesRepository repo;
	
	@GetMapping(value = "/getSales")
	public Iterable<Sales> getSales(){
		return repo.findAll();
	}
	
	@PostMapping(value = "/createSales")
	public Iterable<Sales> createSales(@RequestBody Sales sales){
		repo.save(sales);
		return repo.findAll();
	}
	
	@PutMapping(value = "/updateSales")
	public Iterable<Sales> updateSales(@RequestBody Sales sales){
		repo.save(sales);
		return repo.findAll();
	}
	
	@DeleteMapping(value = "/deleteSales/{client}")
	public Iterable<Sales> deleteSales(@PathVariable("client") String client){
		repo.deleteById(client);
		return repo.findAll();
	}
}
