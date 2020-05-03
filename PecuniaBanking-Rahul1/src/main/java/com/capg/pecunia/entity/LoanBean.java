package com.capg.pecunia.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pecunia_Loan")
public class LoanBean implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int account_id;
	
	
	private Long account_num;
	
	private double amount;
	
	private int tenure;
	
	private int creditScore;
	
	private double RateOfIntrest;
	
	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

 
	public Long getAccount_num() {
		return account_num;
	}

	public void setAccount_num(Long account_num) {
		this.account_num = account_num;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public double getRateOfIntrest() {
		return RateOfIntrest;
	}

	public void setRateOfIntrest(double rateOfIntrest) {
		RateOfIntrest = rateOfIntrest;
	}
	@Override
	public String toString() {
		return "LoanBean [account_id= " + account_id + ",account_num=" + account_num + ", amount=" + amount + ", tenure=" + tenure + ", creditScore=" + creditScore + ", RateOfIntrest=" + RateOfIntrest + "]";
	}
	}
	