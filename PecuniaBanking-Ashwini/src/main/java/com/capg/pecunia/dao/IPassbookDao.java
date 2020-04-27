package com.capg.pecunia.dao;

import com.capg.pecunia.entity.PassbookBean;

public interface IPassbookDao {
	
	public PassbookBean createAccount(PassbookBean bean);
	public PassbookBean findById(long accounNumber);
	public PassbookBean updatePassbook(PassbookBean bean);
	

}
