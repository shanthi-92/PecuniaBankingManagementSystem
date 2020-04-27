package com.capg.pecunia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.pecunia.dao.ILoanDao;
import com.capg.pecunia.entity.LoanBean;

@Service
public class LoanServiceImpl implements ILoanService {
	
	@Autowired
	ILoanDao dao;
	
	@Override
	public LoanBean addAccount(LoanBean bean) {
		return dao.addAccount(bean);
	}
	@Override
	public List<LoanBean> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	
	}

	

		
	

	@Override
	public LoanBean acceptList(int id, int creditScore) {
	
		return dao.acceptList(id,creditScore);
	}

	
}
	