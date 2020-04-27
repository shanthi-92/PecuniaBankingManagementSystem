package com.capg.pecunia.dao;

import com.capg.pecunia.entity.Passbook;

public interface IPassbookDao {
	public Passbook addAccount(Passbook passbook);

	public Passbook getPassbookById(long id);

	public Passbook updatePassbook(Passbook account);

}
