package com.BKEXAM.EXAM;

import java.util.List;




@RestController
public class CustomerController {

	@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		return CustomerService.getCustomer();
	}
	
	@GetMapping("/customers/{id}")
	public Customer getCustomerDetails(@PathVariable int id){
		return CustomerService.getEmployeeDetails(id);
	}
	
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer){
		return CustomerService.addCustomer(customer);
	}
	
	@PutMapping("/customer/{id}")
	public Customer updateCustomer(int id,@RequestBody Customer customer){
		return CustomerService.updateCustomer(id, customer);
	}
	
	@DeleteMapping("/deletecustomer/{id}")
	public Customer deleteCustomer(@PathVariable int id){
		return CustomerService.deleteCustomer(id);
	}
	
}
