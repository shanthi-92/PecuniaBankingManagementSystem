package com.capg.pecunia.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.capg.pecunia.entity.Passbook;

@Repository
@Transactional
public class PassbookDaoImpl implements IPassbookDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public Passbook addAccount(Passbook passbook) {

		em.persist(passbook);
		return passbook;
	}

	@Override
	public Passbook getPassbookById(long id) {

		return em.find(Passbook.class, id);
	}

	@Override
	public Passbook updatePassbook(Passbook account) {
		
		return em.merge(account);
	}

}
