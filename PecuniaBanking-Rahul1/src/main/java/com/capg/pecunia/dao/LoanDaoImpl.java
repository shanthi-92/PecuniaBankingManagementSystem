package com.capg.pecunia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.pecunia.entity.LoanBean;
@Repository
@Transactional
public class LoanDaoImpl implements ILoanDao {

	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public LoanBean addAccount(LoanBean bean) {
		
		 em.persist(bean);
		 
		 return bean;
		 
	}
	@Override
	public List<LoanBean> getAll() {
		TypedQuery<LoanBean> query = em.createQuery("from LoanBean", LoanBean.class);
		return query.getResultList();
	}
	/*@Override
	public LoanBean acceptList(int creditScore) {
		LoanBean bean = em.find(LoanBean.class, creditScore);
		//bean.setCreditScore(bean.getCreditScore()>670);
		if(creditScore > 670)
			em.merge(bean);
		return bean;
	}*/
	@Override
	public LoanBean acceptList(int id, int creditScore) {
		//LoanBean bean = em.find(LoanBean.class, id);
		
		
      		//return bean;
		
		return em.find(LoanBean.class, id);

	}
	

	
}


	