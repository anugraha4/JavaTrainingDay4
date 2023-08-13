package com.nestjavatraining.entity;

public class SavingsMaxAccount extends SavingsAccount {

	public SavingsMaxAccount(String accountCode, String accountName, String openingDate, String expiryDate,
			double accountBalance) {
		super(accountCode, accountName, openingDate, expiryDate, accountBalance);

	}
	
	@Override
	public String toString() 
	{
		return "SavingsMaxAccount ["+super.toString()+"]";
	}
	
	@Override
	public int getFreeLimit() 
	{
		return 0;
	}
	
	@Override
	public void setFreeLimit(int l) 
	{
		
	}
	
	
}
