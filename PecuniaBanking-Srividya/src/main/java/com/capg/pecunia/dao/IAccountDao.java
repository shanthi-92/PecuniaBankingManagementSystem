package com.capg.pecunia.dao;

import com.capg.pecunia.entity.AccountBean;

public interface IAccountDao {
	boolean updateCustomerDetails(AccountBean account);
	AccountBean closeAccount(AccountBean account);
	

}
