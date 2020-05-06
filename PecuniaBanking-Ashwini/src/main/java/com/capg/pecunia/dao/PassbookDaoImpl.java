package com.capg.pecunia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.pecunia.entity.PassbookBean;

@Repository
@Transactional
public class PassbookDaoImpl implements IPassbookDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public PassbookBean addAccount(PassbookBean bean) {
		// TODO Auto-generated method stub
		return em.merge(bean);
	}

	@Override
	public PassbookBean findById(long id) {
		// TODO Auto-generated method stub
		return em.find(PassbookBean.class, id);
	}

	@Override
	public PassbookBean updatePassbook(PassbookBean bean) {
		// TODO Auto-generated method stub
		PassbookBean pass = findById(bean.getAccountNumber());
		pass.setAmount(bean.getAmount());
		pass.setUserName(bean.getUserName());

		pass = em.merge(pass);
		return pass;
	}

	@Override
	public List<PassbookBean> getAll() {
		TypedQuery<PassbookBean> query = em.createQuery("from PassbookBean", PassbookBean.class);
		return query.getResultList();
	}

}
