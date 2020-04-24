package com.capg.pecunia.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class AccoouontSummary {
	
	@Id
	private long transactionId;
	private LocalDate transactionDate;
	private float amounttransmitted;
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public float getAmounttransmitted() {
		return amounttransmitted;
	}
	public void setAmounttransmitted(float amounttransmitted) {
		this.amounttransmitted = amounttransmitted;
	}
	public AccoouontSummary(long transactionId, LocalDate transactionDate, float amounttransmitted) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.amounttransmitted = amounttransmitted;
	}

	

}
