package com.capg.pecunia.service;

import com.capg.pecunia.entity.AccountBean;

public interface IAccountService  {
	boolean updateCustomerDetails(AccountBean account);
	AccountBean closeAccount(AccountBean account);

     
}
