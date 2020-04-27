package com.capg.pecunia.service;

import com.capg.pecunia.entity.PassbookBean;

public interface IPassbookService {
	
	public PassbookBean createAccount(PassbookBean bean);
	public PassbookBean findById(long id);
	public PassbookBean updatePassbook(PassbookBean bean);
	


}
