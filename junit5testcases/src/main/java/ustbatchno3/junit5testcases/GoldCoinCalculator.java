package ustbatchno3.junit5testcases;


import java.time.LocalDate;

public class GoldCoinCalculator {

	public String  findcoins(LocalDate date) {
		
		int dayOfYear=date.getDayOfYear();
		
		if (dayOfYear<80||dayOfYear>365) {
			return "*****";
		}else if (dayOfYear<172) {
			return "***";
		}
		
		return null;
	}

};


