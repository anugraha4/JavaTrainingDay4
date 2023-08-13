package com.nestjavatraining.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String customerCode;
	private String customerName;
	private Account account;
	
	public ArrayList<Account> accountList;
	
	public Customer(String customerCode, String customerName, Account account) {

		this.customerCode = customerCode;
		this.customerName = customerName;
		this.account = account;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Account getAccount() {
		return account;
	}

}