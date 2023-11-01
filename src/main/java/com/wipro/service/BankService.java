package com.wipro.service;



import org.springframework.stereotype.Service;



@Service
public class BankService {
	

	public String printName(String name) {
	     return "Bank Name: " + name;
	}
	
	public String printAddress(String address) {
		return "Bank Address: " + address;
	}
}
