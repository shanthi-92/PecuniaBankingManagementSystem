package com.capg.pecunia.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.pecunia.entity.AccountBean;
import com.capg.pecunia.service.*;
import com.capg.pecunia.exception.*;



@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class AccountRestController {

	@Autowired
     IAccountService accountservice;
	
	@GetMapping("/find/{accNumber}")
	public  AccountBean findById(@PathVariable long accNumber) throws AccountException
	{
		AccountBean bean= accountservice.findById(accNumber);
		if(bean==null)
			throw new AccountException("Id Not Found ,Wrong Id :" +accNumber);
		return bean;
	}
	
	@PutMapping("/update/{accNumber}")
	public AccountBean update(@PathVariable long accNumber, @RequestBody AccountBean bean ) {
		
		return accountservice.update(bean);
	}
}
