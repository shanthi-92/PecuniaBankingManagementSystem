package com.capg.pecunia.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.pecunia.entity.AccountBean;

@Repository
@Transactional
public class AccountDaoImpl implements IAccountDao{

	@PersistenceContext
	EntityManager em;
	


	@Override
	public AccountBean findById(long accNumber) {
		return em.find(AccountBean.class, accNumber);
	}

	@Override
	public AccountBean update(AccountBean bean) {
		return em.merge(bean);	
	}

}
