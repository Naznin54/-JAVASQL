package charge;

public class SavingsAccount extends Account implements MaintenanceCharge{
    
	SavingsAccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateMaintenanceCharge(float noOfYears) {
		// TODO Auto-generated method stub
		return (50*noOfYears)+50;
	}
	

}
