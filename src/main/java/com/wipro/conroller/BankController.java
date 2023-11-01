package com.wipro.conroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.service.BankService;

@RestController
public class BankController {
	@Autowired
	BankService service;

	@GetMapping("/name/{bank}")
	public String BankName(@PathVariable("bank")String name) {
		
		return service.printName(name);
	}
	
	@GetMapping("/address/{bank}")
	public String BankAddress(@PathVariable("bank")String address) {
		
		return service.printAddress(address);
	}
}
