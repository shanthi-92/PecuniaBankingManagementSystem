package com.capg.pecunia.dao;

import java.util.List;

import com.capg.pecunia.entity.TransactionBean;

public interface ITransactionDao {
	
	
	public TransactionBean addAccount(TransactionBean bean);
	
	public TransactionBean creditUsingSCheque(int id, double amount);
	
	public TransactionBean debitUsingCheque(int id, double amount);
	

}
