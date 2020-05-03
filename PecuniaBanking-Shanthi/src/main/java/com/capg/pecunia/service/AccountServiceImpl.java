package com.capg.pecunia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capg.pecunia.dao.IAccountDao;
import com.capg.pecunia.entity.AccountBean;
@Service
public class AccountServiceImpl implements IAccountService {
@Autowired
IAccountDao dao;

@Override	
	public AccountBean addAccount( AccountBean bean ) 
	{
		return dao.addAccount(bean);
	}
}
