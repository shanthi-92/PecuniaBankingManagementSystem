package com.capg.pecunia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.pecunia.dao.IPassbookDao;
import com.capg.pecunia.entity.PassbookBean;


@Service
public class PassbookServiceImpl implements IPassbookService {
	
	@Autowired
	IPassbookDao dao;
	
	@Override
	public PassbookBean createAccount(PassbookBean bean) {
		// TODO Auto-generated method stub
		return dao.createAccount(bean);
	}


	@Override
	public PassbookBean findById(long accountNumber) {
		// TODO Auto-generated method stub
		return dao.findById(accountNumber);
	}

	@Override
	public PassbookBean updatePassbook(PassbookBean bean) {
		// TODO Auto-generated method stub
		return dao.updatePassbook(bean);
	}

	
}
