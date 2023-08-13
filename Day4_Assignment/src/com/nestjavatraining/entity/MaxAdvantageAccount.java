package com.nestjavatraining.entity;

public class MaxAdvantageAccount extends CurrentAccount {

	public MaxAdvantageAccount(String accountCode, String accountName, String openingDate, String expiryDate,
			double accountBalance)
	{
		super(accountCode, accountName, openingDate, expiryDate, accountBalance);
	}

	@Override
	public String toString() {
		return "MaxAdvantageAccount ["+super.toString()+"]";
	}

	@Override
	public int getFreeLimit() {
		return 0;
	}

	@Override
	public void setFreeLimit(int s) {
		
	}
	
	
	
}
