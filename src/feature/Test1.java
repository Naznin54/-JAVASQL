package feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.*;;

public class Test1 {
	public static void main(String[] args) {  
	    List<Customer> c = new ArrayList<Customer>();  
	   
	    c.add(new Customer(1,"Naznin",23456712,"naz@jk.com","pqr"));  
	    c.add(new Customer(2,"Dan",67453923,"pgr@jk.com","xyz"));  
	    c.add(new Customer(3,"Amala",6745561,"hhh@jk.com","abc"));  
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the registerid");
	    int id=sc.nextInt();
	    
	    List<Customer> details=c.stream()
	    		.filter(v->(v.getRegisterid())==id)
	    		.collect(Collectors.toList());
	    
	    if(details.isEmpty())
	      System.out.println("Invalid");
	    else
	    		
	    
	      System.out.println(details);
	    
	}

	    
	    
	    
	    
     

}
