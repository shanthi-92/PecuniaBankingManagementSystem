package com.capg.pecunia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pecunia_Passbook")
public class PassbookBean {

	@Id
	private long accountNumber;
	private String userName;
	private double amount;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double balance) {
		this.amount = balance;
	}

	@Override
	public String toString() {
		return "PassbookBean [accountNumber=" + accountNumber + ", userName=" + userName + ", amount=" + amount + "]";
	}

			

}