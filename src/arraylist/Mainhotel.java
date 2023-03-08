package arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import feature.Customer;
import feature.Employee;

public class Mainhotel {

	public static void main(String[] args) {
		List<Object> Persondetails=Arrays.asList(7865,"Sharath","naz@gmail.com","KOWDIAR");
		List<Hotel> list=Arrays.asList(new Hotel("xyz",3000,"Kowdiar"),
	            new Hotel("abc",1500,"Pettah"),
	            new Hotel("pqr",1000,"Kulathoor"));
		
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the budget");
		    int b=sc.nextInt();
		    
		
        List<Hotel> details=list.stream()
					    		.filter(v->(v.getBudget())<b)
					    		
					    		.collect(Collectors.toList());
        
		

	}

}
