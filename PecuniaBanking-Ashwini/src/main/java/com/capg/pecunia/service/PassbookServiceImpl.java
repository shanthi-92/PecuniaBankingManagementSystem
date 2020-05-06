package com.capg.pecunia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.pecunia.dao.IPassbookDao;

import com.capg.pecunia.entity.PassbookBean;

@Service
public class PassbookServiceImpl implements IPassbookService {

	@Autowired
	IPassbookDao dao;

	@Override
	public PassbookBean addAccount(PassbookBean bean) {

		String str = String.valueOf(bean);
		if (str.matches("[1-9]{1}[0-9]{11}")) {

		} else
			try {
				throw new Exception("Invalid account number");
			} catch (Exception e) {

				e.printStackTrace();
			}

		// TODO Auto-generated method stub
		return dao.addAccount(bean);
	}

	@Override
	public PassbookBean findById(long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public PassbookBean updatePassbook(PassbookBean bean) {

		// TODO Auto-generated method stub
		return dao.updatePassbook(bean);
	}

	@Override
	public List<PassbookBean> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}

