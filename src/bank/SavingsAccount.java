
package bank;

import java.util.Scanner;
public class SavingsAccount extends Account {
	          private double minimumBalance;

			public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
				super(accountNumber, customerObj, balance);
				this.minimumBalance = minimumBalance;
			}
			
			public boolean withdraw(double amount)
			{   
				
				if((balance-amount)<minimumBalance) {
					double balance=minimumBalance-amount;
					return true;
				}
				else
				  
					return false;
			    
			}    

	
	}


