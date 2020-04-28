package com.capg.pecunia.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.pecunia.entity.LoanBean;
import com.capg.pecunia.service.LoanServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoanRestController {

	@Autowired
	LoanServiceImpl lsi;
    

	@PostMapping("/loanRequest/create")    
	public String createAccount(@RequestBody LoanBean bean) {
		LoanBean b= lsi.addAccount(bean);
		return "Hello " + b.getAccount_num() + "\n Your request is Successfully Registered \n" + "Your Account Id is "
		+ b.getAccount_id();

				
	}
	@GetMapping("/requestList/findall")      
	public List<LoanBean> getall(){ 

		List<LoanBean> bean = lsi.getAll();
		return bean;
	}
  
	@GetMapping("/loanDisbursal/{id}/{creditScore}") 
	public String acceptList(@PathVariable int id, @PathVariable int creditScore) throws Exception{
		LoanBean b = lsi.acceptList(id,creditScore);
		
		
		if(creditScore<670)
		{
			throw new Exception("Loan is Rejected");
			//System.out.println("Loan is Rejected");
		}
		return "Hello " + b.getAccount_id() + "\n Your Loan  is Approved" + "\n Your Account Number is " +b.getAccount_num();
		//System.out.println("Loan is Rejected");



		
		
		

	}
	}

