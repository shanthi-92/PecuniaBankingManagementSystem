package com.capg.pecunia.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.pecunia.entity.PassbookBean;



@Repository
@Transactional
public class PassbookDaoImpl implements IPassbookDao {
	
	
	@PersistenceContext
	EntityManager em;
	@Override
	public PassbookBean createAccount(PassbookBean bean) {
		// TODO Auto-generated method stub
		return em.merge(bean);
	}


	@Override
	public PassbookBean findById(long accountNumber) {
		// TODO Auto-generated method stub
		return em.find(PassbookBean.class, accountNumber);
	}

	@Override
	public PassbookBean updatePassbook(PassbookBean bean) {
		// TODO Auto-generated method stub
		PassbookBean pass=findById(bean.getAccountNumber());
		pass.setBalance(bean.getBalance());
		pass.setUserName(bean.getUserName());
		
		pass=em.merge(pass);
		return pass;
	}

	
}
