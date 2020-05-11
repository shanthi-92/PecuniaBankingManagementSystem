package com.capg.pecunia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.pecunia.entity.AccountBean;
import com.capg.pecunia.service.AccountServiceImpl;



@CrossOrigin(origins="http://localhost:4200")
@RestController
public class AccountRestController {
	@Autowired
	AccountServiceImpl service;
	@PostMapping("/bank/create")   
	public String createAccount(@RequestBody AccountBean bean) {
		AccountBean b = service.addAccount(bean);
		return  "Hello " + b.getCustomerFirstName()+b.getCutomerLastName() + "\n Your Registration is Successfull\n" + "Your Account Id is "
				+ b.getAccountNumber();
	}
	
	
	
	
	

}