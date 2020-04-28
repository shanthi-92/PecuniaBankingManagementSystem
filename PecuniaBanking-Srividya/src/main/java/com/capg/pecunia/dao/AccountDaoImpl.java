package com.capg.pecunia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.pecunia.entity.AccountBean;

@Repository
@Transactional
public class AccountDaoImpl implements IAccountDao{

	@PersistenceContext
	EntityManager entityManager;
	

	@Override
	public AccountBean findById(long accNumber) {
		return entityManager.find(AccountBean.class,accNumber);
	}

	@Override
	public AccountBean update(AccountBean accountbean) {
		//AccountBean bean =entityManager.find(AccountBean.class,accountbean.getAccNumber());
		  AccountBean bean = findById(accountbean.getAccNumber());
		  bean.setCustomerName(accountbean.getCustomerName());
		  bean.setCustomerPhno(accountbean.getCustomerPhno());
		  bean.setAccType(accountbean.getAccType());
		  bean.setCustomerAddress1(accountbean.getCustomerAddress1());
		  bean.setCustomerAddress2(accountbean.getCustomerAddress2());
		  bean.setCity(accountbean.getCity());
		  bean.setState(accountbean.getState());
		  bean.setCountry(accountbean.getCountry());
		  bean.setPincode(accountbean.getPincode());
		  bean.setBalance(accountbean.getBalance());
		  
		 
		bean=entityManager.merge(bean);
		return bean;
	}
	
	
	@Override
	public void delete(long accNumber) {
		AccountBean bean=entityManager.find(AccountBean.class, accNumber);
		entityManager.remove(bean);
	}

}
