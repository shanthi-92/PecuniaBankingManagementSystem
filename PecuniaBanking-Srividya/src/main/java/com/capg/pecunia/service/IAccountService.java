package com.capg.pecunia.service;

import java.util.List;

import com.capg.pecunia.entity.AccountBean;

public interface IAccountService  {
	
AccountBean findById(long accNumber);
	
	AccountBean update(AccountBean bean); 
	
	void delete(long accNumber);

	
     
}
