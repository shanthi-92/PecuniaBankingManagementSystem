package com.capg.pecunia.service;

import java.util.List;

import com.capg.pecunia.entity.PassbookBean;

public interface IPassbookService {

	public PassbookBean addAccount(PassbookBean bean);

	public PassbookBean findById(long id);

	public PassbookBean updatePassbook(PassbookBean bean);
	public List<PassbookBean> getAll();
	


}



































/*
 * List<PassbookBean> findAllDetails();
 * 
 */
