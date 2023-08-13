package com.nestjavatraining.service;

import java.util.ArrayList;

import com.nestjavatraining.entity.Account;
import com.nestjavatraining.entity.ActiveCurrentAccount;
import com.nestjavatraining.entity.CurrentAccount;
import com.nestjavatraining.entity.Customer;
import com.nestjavatraining.entity.MaxAdvantageAccount;
import com.nestjavatraining.entity.SavingsAccount;
import com.nestjavatraining.entity.SavingsMaxAccount;
import com.nestjavatraining.entity.WomenSavingsAccount;

public class SavingsAccountImpl implements AccountService {

	@Override
	public Account createAccount(int choice) {
		
		Account account=null;	 
		if(choice == 1)
		{
		
			account = new WomenSavingsAccount("WSA001","WomenSavings","10.02.2022","10.02.2033",20000,3);

		}
		else if(choice == 2)
		{
			
			account = new SavingsMaxAccount("SMA001","SavingsMaxAc","02.02.2022","02.02.2040",40000);
			
		}
		else if(choice == 3)
		{
			account = new MaxAdvantageAccount("MAA001","MaxAdvantage","14.02.2023","26.03.2035",60000);
			
		}
		else if(choice == 4)
		{
			account = new ActiveCurrentAccount("ACA001","ActiveCurrent","15.02.2023","03.03.2030",70000);
		}
		
		return account;

	}

	@Override
	public void depositAmount(String accCode,int depositAmount,ArrayList<Account> accountsCreated) {
		
		int foundAccount=0;
		
		 for (int i = 0; i < accountsCreated.size(); i++) 
		 {
	            if (accCode.equals(accountsCreated.get(i).getAccountCode())) 
	            {
	                
	            	accountsCreated.get(i).setAccountBalance(accountsCreated.get(i).getAccountBalance()+depositAmount);
	        		
	        		System.out.println("\nNew Account Balance: "+ accountsCreated.get(i).getAccountBalance());
	        		
	        		foundAccount=1;
	        		
	        		break;
	                
	            }
	            
	         
		 }
		 
		 if(foundAccount == 0)
        {
        	System.out.println("Account Code does not exist");
        }

	}

	@Override
	public void withdrawAmount(String accCode1,int withdrawAmount,ArrayList<Account> accountsCreated) 
	{
		
		int foundAccount=0;
		
		for (int i = 0; i < accountsCreated.size(); i++) 
		{
	            if (accCode1.equals(accountsCreated.get(i).getAccountCode()))
	            {
	            	foundAccount=1;
		
					if(accountsCreated.get(i).getAccountBalance() < withdrawAmount)
					{
						System.out.println("\nAccount Balance is less than withdrawal amount\n");
						
						break;
					}
					
					else
					{
						accountsCreated.get(i).setAccountBalance(accountsCreated.get(i).getAccountBalance()-withdrawAmount);
			
						System.out.println("\nNew Account Balance: "+ accountsCreated.get(i).getAccountBalance());
						
						break;
			
					}
					
	            }
	            
		}
		
		if(foundAccount == 0)
        {
        	System.out.println("Account Code does not exist");
        }

	}

	@Override
	public Customer createCustomer(Account account) {
		
		 Customer customer = new Customer("CUS101","Anugraha",account);   
		 
		 
		 return customer;

	}
	
	

}
