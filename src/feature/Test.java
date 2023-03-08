package feature;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Employee> employee=Arrays.asList(new Employee("xyz","Naznin",150000.0),
				            new Employee("abc","Priya",60000.0),
				            new Employee("pqr","Faizy",40000.0));
		List<Employee> emp=employee.stream()
				.filter(Employee->Employee.getSalary()<=200000)
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.peek(Employee->{
					double salary=Employee.getSalary();
					if(salary>100000){
						Employee.setSalary(salary*1.05);
					}else if(salary>50000){
						Employee.setSalary(salary*1.1);
					} 
				 
				})

				.collect(Collectors.toList());	
				System.out.println(emp);
		
	
}
}
