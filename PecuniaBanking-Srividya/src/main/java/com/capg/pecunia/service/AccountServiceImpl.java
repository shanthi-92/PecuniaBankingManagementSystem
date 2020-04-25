package com.capg.pecunia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.pecunia.dao.IAccountDao;
import com.capg.pecunia.entity.AccountBean;

@Service
public class AccountServiceImpl implements IAccountService {
	
	 @Autowired
	 IAccountDao accountDao;
	
	
	@Override
	public AccountBean findById(long accNumber) {
		 
		return accountDao.findById(accNumber);
	}

	@Override
	public AccountBean update(AccountBean bean) {
		
		return accountDao.update(bean);
	}

	@Override
	public void delete(long accNumber) {
		
		accountDao.delete(accNumber);
		
	}
	
}
