package com.nestjavatraining.service;

import java.util.ArrayList;

import com.nestjavatraining.entity.Account;
import com.nestjavatraining.entity.Customer;
import com.nestjavatraining.entity.SavingsAccount;

public interface AccountService {
	
	public Account createAccount(int choice);
	public Customer createCustomer(Account account);
	public void depositAmount(String accCode,int depositAmount,ArrayList<Account> accountsCreated);
	public void withdrawAmount(String accCode1,int withdrawAmount,ArrayList<Account> accountsCreated);

}
