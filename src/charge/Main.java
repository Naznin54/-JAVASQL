package charge;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		float noOfYears;
		String accnum;
		String custName;
		double bal;
		System.out.println("1.SavingsAccount\n2.CurrentAccount");
		i=sc.nextInt();
	    System.out.println("enter account number:");
	    accnum=sc.next();
	    System.out.println("enter customer name");
		custName=sc.next();
		System.out.println("Enter balance");
		bal=sc.nextDouble();
		System.out.println("Enter number of yeas");
		noOfYears=sc.nextFloat();	
		
		if(i==1) 
		{
			SavingsAccount s=new SavingsAccount(accnum,custName,bal);
			s.calculateMaintenanceCharge(noOfYears);
			System.out.println("accountnum:"+s.getaccnumr());
			System.out.println("customer name:"+s.customerName());
			System.out.println("Balance:"+s.gerbalance());
			System.out.println("Noofyears:"+noOfYears);
		}
			
	    }

}}