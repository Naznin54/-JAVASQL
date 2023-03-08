package charge;

public class CurrentAccount extends Account implements MaintenanceCharge{

	CurrentAccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateMaintenanceCharge(float noOfYears) {
		// TODO Auto-generated method stub
		return (100*noOfYears)+200;
	}
                     
}
