package com.capg.pecunia.service;

 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.pecunia.dao.ITransactionDao;
import com.capg.pecunia.entity.TransactionBean;

@Service
public class TransactionServiceImpl implements ITransactionService {
	
	@Autowired
	ITransactionDao dao;
	
	
	  @Override
	  public TransactionBean addAccount(TransactionBean bean) {
		  return dao.addAccount(bean);
	  }
	  
	
	@Override
	public TransactionBean creditUsingCheque(int id, double amount) {
		return dao.creditUsingCheque(id, amount);
	}

	@Override
	public TransactionBean debitUsingCheque(int id, double amount) {

		return dao.debitUsingCheque(id, amount);
	}

}
