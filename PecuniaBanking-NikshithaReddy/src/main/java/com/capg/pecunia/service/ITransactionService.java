package com.capg.pecunia.service;

 import java.util.List;

import com.capg.pecunia.entity.TransactionBean;

public interface ITransactionService {

	
	public TransactionBean addAccount(TransactionBean bean);
	
	public TransactionBean creditUsingCheque(int id, double amount);
	
	public TransactionBean debitUsingCheque(int id, double amount);
	
	
}
