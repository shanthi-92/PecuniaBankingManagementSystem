package com.capg.pecunia.service;



import com.capg.pecunia.entity.AccountBean;



public interface IAccountService {
	public String addAccount(AccountBean account);
	
	public boolean validateName(String customerName) ;
	public boolean validatePan(String customerPan);
	public boolean validateContact(String customerContact);
	public boolean validateAadhar(String customerAadhar);
	public boolean validateDateOfBirth(String dob);
	public boolean validatePin(String pin);

}



