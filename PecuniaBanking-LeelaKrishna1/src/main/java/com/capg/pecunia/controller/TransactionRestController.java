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
     //http://localhost:8090/transaction/create
	// POSTMAN (Post : body{ "customer_name": "Ramesh", "amount": 50000.0, "contact_number": "97000000"}
	//dont insert id ,  id is  :@GeneratedValue(strategy = GenerationType.SEQUENCE)

	
	  @PostMapping("/transaction/create") //postman :POST
	  public String createAccount(@RequestBody TransactionBean bean) { 
		  TransactionBean b = bsi.addAccount(bean);
		  return "Hello " + b.getCustomer_name() + "\n Your Registration is Successfull\n" + "Your Account Id is " +
	  b.getAccount_id(); 
	  } 
	  
	  
	
	 	@GetMapping("/transaction/creditUsingSlip/{id}/{amount}")  //GET:   http://localhost:8090/transaction/creditUsingSlip/10/1000
	public String creditUsingSlip(@PathVariable int id, @PathVariable double amount) throws Exception {
		TransactionBean b = bsi.creditUsingSlip(id, amount);

		if (b == null) {
			throw new Exception("Invalid id");
		}
		return "Hello " + b.getCustomer_name() + "\n Your Amount is Deposited Succesfully\n"
				+ "Your Current Account Balance is " + b.getAmount();

	}
	    // GET :  http://localhost:8090/transaction/debitUsingSlip/10/2000
	@GetMapping("/transaction/debitUsingSlip/{id}/{amount}") 
	public String debitUsingSlip(@PathVariable int id, @PathVariable double amount) throws Exception {
		TransactionBean b = bsi.debitUsingSlip(id, amount);

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
