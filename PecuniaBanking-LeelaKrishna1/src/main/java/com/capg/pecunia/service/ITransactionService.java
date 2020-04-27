package com.capg.pecunia.service;

 import java.util.List;

import com.capg.pecunia.entity.TransactionBean;

public interface ITransactionService {

	
	public TransactionBean addAccount(TransactionBean bean);
	
	public TransactionBean creditUsingSlip(int id, double amount);
	
	public TransactionBean debitUsingSlip(int id, double amount);
	
	
}
