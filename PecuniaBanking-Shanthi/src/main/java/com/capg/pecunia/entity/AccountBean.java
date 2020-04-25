package com.capg.pecunia.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account")

public class AccountBean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String accountNumber;
	private String customerFirstName;
	private String cutomerLastName;

	
	  double accountBalance;
	  String customerAadhar;
	  String cutomerPan;
	  String cutomerDob;
	  String customerContact;
	 
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getCustomerAadhar() {
		return customerAadhar;
	}
	public void setCustomerAadhar(String customerAadhar) {
		this.customerAadhar = customerAadhar;
	}
	public String getCutomerPan() {
		return cutomerPan;
	}
	public void setCutomerPan(String cutomerPan) {
		this.cutomerPan = cutomerPan;
	}
	public String getCutomerDob() {
		return cutomerDob;
	}
	public void setCutomerDob(String cutomerDob) {
		this.cutomerDob = cutomerDob;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	AccountBean()
	{
		super();
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCutomerLastName() {
		return cutomerLastName;
	}
	public void setCutomerLastName(String cutomerLastName) {
		this.cutomerLastName = cutomerLastName;
	}
	
}
	