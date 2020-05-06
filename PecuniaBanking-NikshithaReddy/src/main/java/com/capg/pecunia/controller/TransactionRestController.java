package com.capg.pecunia.controller;

 import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.pecunia.entity.TransactionBean;
import com.capg.pecunia.service.TransactionServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TransactionRestController {

	@Autowired
	TransactionServiceImpl bsi;
     
	
	  @PostMapping("/transaction/create") //postman :POST
	  public String createAccount(@RequestBody TransactionBean bean) { 
		  TransactionBean b = bsi.addAccount(bean);
		  return "Hello " + b.getCustomer_name() + "\n Your Registration is Successfull\n" + "Your Account Id is " +
	  b.getAccount_id(); 
	  } 
	  
	  
	
	 	@GetMapping("/transaction/creditUsingCheque/{id}/{amount}")  //GET:   http://localhost:8090/transaction/creditUsingCheque/10/1000
	public String creditUsingCheque(@PathVariable int id, @PathVariable double amount) throws Exception {
		TransactionBean b = bsi.creditUsingCheque(id, amount);

		if (b == null) {
			throw new Exception("Invalid id");
		}
		return "Hello " + b.getCustomer_name() + "\n Your Amount is Deposited Succesfully\n"
				+ "Your Current Account Balance is " + b.getAmount();

	}
	    // GET :  http://localhost:8090/transaction/debitUsingCheque//10/2000
	@GetMapping("/transaction/debitUsingSlip/{id}/{amount}") 
	public String debitUsingCheque(@PathVariable int id, @PathVariable double amount) throws Exception {
		TransactionBean b = bsi.debitUsingCheque(id, amount);

		if (b == null) {
			throw new Exception("Invalid id");
		}
		return "Hello " + b.getCustomer_name() + "\n Your Amount is Withdrawn Succesfully\n"
		+ "Your Current Account Balance is " + b.getAmount();
		

	}

	
	
	 
	@ExceptionHandler(Exception.class)
	public String inValid(Exception e) {
		return e.getMessage();
	}

}
