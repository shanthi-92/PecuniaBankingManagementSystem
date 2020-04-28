package com.capg.pecunia.dao;

import java.util.List;

import com.capg.pecunia.entity.PassbookBean;


public interface IPassbookDao {
	
	public PassbookBean addAccount(PassbookBean bean);
	public PassbookBean findById(long accounNumber);
	public PassbookBean updatePassbook(PassbookBean bean);
	
}









































/*
 * List<PassbookBean> findAllDetails();
 * 
 */