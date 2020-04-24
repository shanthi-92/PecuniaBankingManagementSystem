package com.capg.pecunia.service;

import com.capg.pecunia.entity.Passbook;

public interface IPassbookService {
	
	public Passbook addAccount(Passbook passbook);

	public Passbook getPassbookById(long id);

	public Passbook updatePassbook(Passbook account);


}
