package com.capg.pecunia.service;

import java.util.List;

import com.capg.pecunia.entity.LoanBean;

public interface ILoanService {

	
	public LoanBean addAccount(LoanBean bean);
public	LoanBean acceptList(int id, int creditScore);
public List<LoanBean> getAll();

}
	
	