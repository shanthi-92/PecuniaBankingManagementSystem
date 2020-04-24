package com.capg.pecunia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.pecunia.dao.IPassbookDao;
import com.capg.pecunia.entity.Passbook;


@Service
public class PassbookServiceImpl implements IPassbookService {
	
	@Autowired
	IPassbookDao dao;

	@Override
	public Passbook addAccount(Passbook passbook) {
		// TODO Auto-generated method stub
		return dao.addAccount(passbook);
	}

	@Override
	public Passbook getPassbookById(long id) {
		// TODO Auto-generated method stub
		return dao.getPassbookById(id);
	}

	@Override
	public Passbook updatePassbook(Passbook account) {
		// TODO Auto-generated method stub
		return dao.updatePassbook(account);
	}

}
