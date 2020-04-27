package com.capg.pecunia.dao;

import java.util.List;

import com.capg.pecunia.entity.AccountBean;

public interface IAccountDao {
	AccountBean findById(long accNumber);
	AccountBean update( AccountBean bean); 
	void delete(long accNumber);
	 
}
