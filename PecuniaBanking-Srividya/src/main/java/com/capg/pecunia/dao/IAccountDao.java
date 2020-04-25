package com.capg.pecunia.dao;

import com.capg.pecunia.entity.AccountBean;

public interface IAccountDao {
	public AccountBean findById(long accNumber);
	  public AccountBean update(AccountBean bean);

}
