package ustbatchno3.TestNG;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Constructiontest {
	public void constest() {
	
	      List<Construction> a= Arrays.asList(
	       new Construction("TVM",1600,800),
	       new Construction("Chennai",1800,1000),
	       new Construction("Hyderabad",2000,900),
	       new Construction("Mumbai",2500,1200),
	       new Construction("Kochi",1800,1200)
           );
	        String c="Mumbai";
	        int squarefeet=2;
	        int Amount = a.stream()
	                .filter(b -> b.getCity().equals(c))
	                .mapToInt(Construction::getTotalamount())
	                .sum();
	                
	           
	   
	        System.out.println("Total amount for " + c + ": " + Amount);
	    }
	
		       
}
