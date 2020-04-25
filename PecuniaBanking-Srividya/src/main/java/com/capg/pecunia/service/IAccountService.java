package com.capg.pecunia.service;

import com.capg.pecunia.entity.AccountBean;

public interface IAccountService  {
	
	public AccountBean findById(long accNumber);
	public AccountBean update(AccountBean bean);
	
     
}
