package com.prasad.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prasad.Repository.Reposiory;
import com.prasad.model.Product;
import com.prasad.model.ProductList;

@RestController
@RequestMapping("/service")
public class MainController {

	@Autowired
	private Product product;

	@Autowired
	private Reposiory reposiory;

/*	@RequestMapping("/")
	public String message() {
		return "index";
	}*/

	@PostMapping("/save")
	public Product save(@RequestBody Product product) {
		System.out.println("the product details are i am from productservice: " + product);
		return reposiory.save(product);
	}

	@GetMapping(path = "/findbyId/{id}", produces = "application/json")
	public Optional<Product> getGreetings(@PathVariable("id") Long pid) {
		if (reposiory.findById(pid) != null)
			return reposiory.findById(pid);
		return null;
	}

	@PutMapping(path = "/update/{id}", produces = "application/json")
	public Product getGreetings1(@PathVariable("id") Long pid, @RequestBody Product product) {
		Product product1 = reposiory.findById(pid).get();
		product=product1;
		//	product1.setPro
		return reposiory.save(product);

//	return null;
	}

	@DeleteMapping(path = "/deletebyId/{id}", produces = "application/json")
	public String getGreetings2(@PathVariable("id") Long pid) {

		reposiory.deleteById(pid);
		if (reposiory.findById(pid) == null) {
			return "not deleted";
		} else {
			return "deleted sucessfully";
		}
	}

	@GetMapping("/getallProducts")
	public ProductList getalldetaills(){
		List<Product> obj=reposiory.findAll();
		ProductList productList =  new ProductList();
		productList.setProducts(obj);
		for(Product obj1 : obj) {
		System.out.println("the products are  : "+obj1);
		}
		return productList;
	}
	
	
	
}
