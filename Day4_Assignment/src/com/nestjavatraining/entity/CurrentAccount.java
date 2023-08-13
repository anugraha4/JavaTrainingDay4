package com.nestjavatraining.entity;

public abstract class CurrentAccount extends Account {
	
	private double accountBalance;

	public CurrentAccount(String accountCode, String accountName, String openingDate, String expiryDate,
			double accountBalance) {
		super(accountCode, accountName, openingDate, expiryDate);
		this.accountBalance = accountBalance;
	}

	@Override
	public double getAccountBalance() {
		return accountBalance;
	}

	@Override
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "accountBalance=" + accountBalance +"," + super.toString();
	}

	public abstract int getFreeLimit();
	public abstract void setFreeLimit(int s);
	
	
}
