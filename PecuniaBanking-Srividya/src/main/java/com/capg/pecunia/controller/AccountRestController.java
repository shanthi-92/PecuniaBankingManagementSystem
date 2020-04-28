package com.capg.pecunia.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	@GetMapping(path="/getdetails/{accNumber}")
	public ResponseEntity<AccountBean> findById(@PathVariable("accNumber") long accNumber) {
		AccountBean bean=accountservice.findById(accNumber);
		if (bean == null) {
            throw new AccountNotFoundException("Account not found for Account number=" + accNumber);
        }
		return new ResponseEntity<AccountBean>(bean,new HttpHeaders(),HttpStatus.OK);
	}
	
	
	@PutMapping(path="/update/")
	public ResponseEntity<AccountBean> updateEmployee( @RequestBody AccountBean bean){
		bean=accountservice.update(bean);
		return new ResponseEntity<AccountBean>(bean,new HttpHeaders(),HttpStatus.OK);
	}
	
	@DeleteMapping(path="/delete/{accNumber}")
	public String deleteEmployee(@PathVariable("accNumber") Long accNumber) {
		accountservice.delete(accNumber);
		return "Deleted";
	}
}

