package sona;

import java.util.Arrays;
import java.util.List;

public class Emp {
	
	public static void main(String args[]) {
	List<Employeedetail> list=Arrays.asList(new Employeedetail("Sona",25,5,50000.0),
			new Employeedetail("Priya",22,1,25000.0),
			new Employeedetail("Saji",26,6,60000.0),
			new Employeedetail("Zara",28,10,100000.0));
	
	 list.forEach(val -> {
                 if(val.getNumofyears()>=1 && val.getNumofyears()<=2) 
                 {
                     double newSalary = val.getSalary() + ((val.getSalary() * 2.5 / 100));
                     val.setSalary(newSalary);
                 } 
                 else if (val.getNumofyears()>=3 && val.getNumofyears()<=6) 
                 {
                     double newSalary = val.getSalary() +((val.getSalary() * 5.0 / 100));
                     val.setSalary(newSalary);
                 }
                 else if (val.getNumofyears()>=7 && val.getNumofyears()<=10) 
                 {
                     double newSalary = val.getSalary() + ((val.getSalary() * 10.0 / 100));
                     val.setSalary(newSalary);
                 } 
                 else if (val.getNumofyears()>10)
                 {
                     double newSalary = val.getSalary() + (val.getSalary() * 12.0/ 100);
                     val.setSalary(newSalary);
                 }
             }
     );

	 System.out.println("\nEmployee Details with incremented Salary: ");
     list.forEach(employee -> System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge() +","
     		+ " Years of Experience: " + employee.getNumofyears() +", "
     		+ "Salary: " + employee.getSalary()));


}	
}


