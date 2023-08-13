package com.nestjavatraining.entity;

public class ActiveCurrentAccount extends CurrentAccount {

	
	public ActiveCurrentAccount(String accountCode, String accountName, String openingDate, String expiryDate,
			double accountBalance) {
		super(accountCode, accountName, openingDate, expiryDate, accountBalance);
	}

	@Override
	public String toString() {
		return "ActiveCurrentAccount ["+super.toString()+"]";
	}
	
	public int getFreeLimit() 
	{
		return 0;
	}
	
	@Override
	public void setFreeLimit(int l) 
	{
		
	}

	
}

