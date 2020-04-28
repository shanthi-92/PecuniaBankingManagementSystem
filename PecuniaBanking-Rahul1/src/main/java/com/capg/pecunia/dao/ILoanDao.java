package com.capg.pecunia.dao;

import java.util.List;

import com.capg.pecunia.entity.LoanBean;

public interface ILoanDao {

	public LoanBean addAccount(LoanBean bean);

	public List<LoanBean> getAll();



	public LoanBean acceptList(int id, int creditScore);

	

	

}
