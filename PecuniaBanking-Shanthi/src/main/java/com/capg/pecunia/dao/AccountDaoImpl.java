package com.capg.pecunia.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.capg.pecunia.entity.AccountBean;
@Repository
@Transactional
public class AccountDaoImpl implements IAccountDao {
	
	@PersistenceContext
	EntityManager em;
	@Override
	public AccountBean addAccount(AccountBean bean) {
		

		 em.persist(bean);
		 
		 return bean;
		
	}
}
