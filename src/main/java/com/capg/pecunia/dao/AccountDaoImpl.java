package com.capg.pecunia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.pecunia.entity.AccountBean;

@Repository
@Transactional
public class AccountDaoImpl implements IAccountDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public AccountBean addAccount(AccountBean bean) {
		
		entityManager.merge(bean);
		return bean;
	}


	@Transactional
	public AccountBean updateAccount(AccountBean bean, long accNumber) {

		  entityManager.merge(bean);
		return bean;
	}
	
	
	@Override
	public void deleteAccount(long accNumber) {
		AccountBean bean=entityManager.find(AccountBean.class, accNumber);
		entityManager.remove(bean);
	}

	@Override
	public List<AccountBean> viewAll() {
		Query query = entityManager.createQuery("select e from AccountBean e");
		List<AccountBean> list= query.getResultList();
		return list;
	}
}