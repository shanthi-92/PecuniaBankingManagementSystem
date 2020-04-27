package com.capg.pecunia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.pecunia.entity.PassbookBean;
import com.capg.pecunia.exception.PassbookException;
import com.capg.pecunia.service.PassbookServiceImpl;

@RestController
@RequestMapping(value="/account")
@CrossOrigin("http://localhost:4200")
public class PassbookRestController {
	
	
		@Autowired
	    private PassbookServiceImpl service;
		
		
	
	@PostMapping(path="/create")
	public ResponseEntity<Boolean> CreateAccount(@RequestBody PassbookBean bean) {
		service.createAccount(bean);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}
	
	@GetMapping(path="/getdetails/{accountNumb}")
	public ResponseEntity<PassbookBean> findById(@PathVariable("accountNumb") long accountNumber) throws PassbookException {
		PassbookBean bean=service.findById(accountNumber);
		if (bean == null) {
            throw new PassbookException("employee not found for id=" + accountNumber);
        }
		return new ResponseEntity<PassbookBean>(bean,new HttpHeaders(),HttpStatus.OK);
	}
	
	
	
	@PutMapping(path="/update")
	public ResponseEntity<PassbookBean> updatePassbook(@RequestBody PassbookBean bean){
		bean=service.updatePassbook(bean);
		return new ResponseEntity<PassbookBean>(bean,new HttpHeaders(),HttpStatus.OK);
	}
	
	
	
	
	

}
