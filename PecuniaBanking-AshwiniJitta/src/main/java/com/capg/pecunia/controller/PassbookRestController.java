package com.capg.pecunia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.pecunia.service.IPassbookService;


@RestController
@RequestMapping("/pbms")
public class PassbookRestController {
	
	
	@Autowired
	IPassbookService service;
	
	

	
	/*
	 * @PostMapping("/add") public String addAccount(@RequestBody Passbook passbook)
	 * {
	 * 
	 * service.addAccount(passbook); return "Account added Succesfully"; }
	 * 
	 * @GetMapping("/get") public String getPassbookById(@RequestBody long id) {
	 * 
	 * service.getPassbookById(id); return "Account find Succesfully"; }
	 * 
	 * @PutMapping("/update") public String updatePassbook(@RequestBody Passbook
	 * account) {
	 * 
	 * service.updatePassbook(account); return "Account Updated Succesfully"; }
	 */


}
