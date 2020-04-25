package com.capg.pecunia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pecunia_Spring")

public class Passbook {
	
	

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private long AccountId;
		private float balance;

		private String userName;

		public long getAccountId() {
			return AccountId;
		}

		public void setAccountId(long accountId) {
			AccountId = accountId;
		}

		public float getBalance() {
			return balance;
		}

		public void setBalance(float balance) {
			this.balance = balance;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Passbook(long accountId, float balance, String userName) {
			super();
			AccountId = accountId;
			this.balance = balance;
			this.userName = userName;
		}
		
}
