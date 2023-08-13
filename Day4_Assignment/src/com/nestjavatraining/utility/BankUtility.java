package com.nestjavatraining.utility;
import java.util.ArrayList;
import java.util.Scanner;
import com.nestjavatraining.entity.Account;
import com.nestjavatraining.entity.Customer;
import com.nestjavatraining.entity.SavingsAccount;
import com.nestjavatraining.service.SavingsAccountImpl;
  
public class BankUtility {

	public static void main(String[] args) {

		SavingsAccountImpl savingsAccountImpl = new SavingsAccountImpl();
		SavingsAccount savingsAccount=null;
		Account account=null;
		
		ArrayList<Account> accountsCreated=new ArrayList<>();
		
		ArrayList<Customer> customerList=new ArrayList<>();

		
		Customer customer=null;
		
		int exit=0;
		
		Scanner scanner = new Scanner(System.in); 
		
		do
		{
			System.out.println("\n************Welcome to DDC Bank************");
			System.out.println("1. Create Women Savings Account \n2. Create Savings Max Account ");
			System.out.println("3. Create Max Advantage Account \n4. Create Active Current Account");
			System.out.println("5. Deposit Amount \n6. Withdraw Amount");
			System.out.println("7. Display Accounts of customer \n8. Exit\n");
			
			int choice = scanner.nextInt();
	
			switch(choice) 
			{ 
			
				case 1:  account = savingsAccountImpl.createAccount(choice);
						 System.out.println(account.toString());
						 
						 customer = savingsAccountImpl.createCustomer(account);
						 
						 System.out.println("Customer Name" + " "+"Account Balance"+"  "+"Customer Code");
						 
						 System.out.println(customer.getCustomerName()+"       "+customer.getAccount().getAccountBalance()+"            "+customer.getCustomerCode()+"\n");
	
						 accountsCreated.add(account);
						 
						 customerList.add(customer);
						 
						 break;
						 
				case 2:  account = savingsAccountImpl.createAccount(choice);
			 			 System.out.println(account.toString());
			 			 
			 			 customer = savingsAccountImpl.createCustomer(account);
						 
						 System.out.println("Customer Name" + " "+"Account Balance"+"  "+"Customer Code");
						 
						 System.out.println(customer.getCustomerName()+"       "+customer.getAccount().getAccountBalance()+"            "+customer.getCustomerCode()+"\n");
						 
			 			 accountsCreated.add(account);
			 			 
			 			 customerList.add(customer);
						 
						 break;
						
						 
				case 3: account = savingsAccountImpl.createAccount(choice);
		 			 	System.out.println(account.toString());
		 			 
		 			 	customer = savingsAccountImpl.createCustomer(account);
					 
		 			 	System.out.println("Customer Name" + " "+"Account Balance"+"  "+"Customer Code");
					 
		 			 	System.out.println(customer.getCustomerName()+"       "+customer.getAccount().getAccountBalance()+"            "+customer.getCustomerCode()+"\n");
		 
		 			 	accountsCreated.add(account);
		 			 
		 			 	customerList.add(customer);
					 
	
		 			 	break;
		 			 	
				case 4: account = savingsAccountImpl.createAccount(choice);
		 			 	System.out.println(account.toString());
			 			 
		 			 	customer = savingsAccountImpl.createCustomer(account);
					 
		 			 	System.out.println("Customer Name" + " "+"Account Balance"+"  "+"Customer Code");
					 
		 			 	System.out.println(customer.getCustomerName()+"       "+customer.getAccount().getAccountBalance()+"            "+customer.getCustomerCode()+"\n");
		
					 
		 			 	accountsCreated.add(account);
		 			 
		 			 	customerList.add(customer);
					 

		 			 
		
		 			 	break;
						 
				case 5: System.out.println("Enter account code to be deposited into: ");
						
						String accCode=scanner.next();
						
						System.out.println("Enter amount to be deposited into account: ");
						
						int depositAmount=scanner.nextInt();
						
						savingsAccountImpl.depositAmount(accCode,depositAmount,accountsCreated);
						
						break;
						
				case 6: System.out.println("Enter account code to be withdrawn from: ");
				
						String accCode1=scanner.next();
						
						System.out.println("Enter amount to be withdrawn from account: ");
						
						int withdrawAmount=scanner.nextInt();
						
						savingsAccountImpl.withdrawAmount(accCode1,withdrawAmount,accountsCreated);
						
						break;
						
				case 7: int i=0;
									
						System.out.println("SINo  AccountCode CustomerName  AccountType      CreateDate   ExpiryDate     Balance    FreeLimit");
						
						System.out.println("\n-----------\n");
								
						for (Customer c : customerList)
						{
							i++;
					
							System.out.println(i + "     " + c.getAccount().getAccountCode() + "     " + c.getCustomerName() +"  "+ c.getAccount().getAccountName() + "      " + c.getAccount().getOpeningDate() + "    " + c.getAccount().getExpiryDate() + "     " + c.getAccount().getAccountBalance()+ "        "+c.getAccount().getFreeLimit());
						}
						
						System.out.println("\n------------\n");

						
						break;
						
				case 8: exit=1;
						break;
						
				default: System.out.println("Invalid Choice");
			
			}
			
			
			
		}while(exit!=1);
		
		scanner.close();
		
	}

}
