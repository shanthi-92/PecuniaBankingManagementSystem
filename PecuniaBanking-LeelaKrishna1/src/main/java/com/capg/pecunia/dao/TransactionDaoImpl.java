package com.capg.pecunia.dao;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.pecunia.entity.History;
import com.capg.pecunia.entity.TransactionBean;
@Repository
@Transactional
public class TransactionDaoImpl implements ITransactionDao {

	
	@PersistenceContext
	EntityManager em;
	
	
	  @Override
	  public TransactionBean addAccount(TransactionBean bean) {
	  
	  em.persist(bean);
	  
	  return bean;
	  
	  }
	 
	 	@Override
	public TransactionBean creditUsingSlip(int id, double amount) {
		TransactionBean bean = em.find(TransactionBean.class, id);
		try {
		bean.setAmount(amount+bean.getAmount());
		}
		catch(Exception e) {
			return null;
		}
		History history = new History("Deposited", id, amount);
		
		em.persist(history);
		
		return em.merge(bean);
	}

	@Override
	public TransactionBean debitUsingSlip(int id, double amount) {
		TransactionBean bean = em.find(TransactionBean.class, id);
		bean.setAmount(bean.getAmount()-amount);
		
	History history = new History("Withdrawn", id, amount);
		
		em.persist(history);
		
		return em.merge(bean);
	}

}
