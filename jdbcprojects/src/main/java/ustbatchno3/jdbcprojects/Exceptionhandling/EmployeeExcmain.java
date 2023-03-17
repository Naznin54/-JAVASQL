package Exceptionhandling;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeExcmain {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = null;
        int empId =0 ;
        String address=null ;
        String location=null;
        long phoneNum =0;
        double salary=0;
        String email=null ;

        try {
            
            System.out.print("Enter employee name: ");
            name = scanner.nextLine();
            if (name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }

            
            System.out.print("Enter employee ID: ");
            empId = scanner.nextInt();
            if (empId <= 0) {
                throw new IllegalArgumentException("Employee ID must be a positive integer");
            }

           
            scanner.nextLine();
            System.out.print("Enter employee address: ");
            address = scanner.nextLine();
            if (address.trim().isEmpty()) {
                throw new IllegalArgumentException("Address cannot be empty");
            }

            
            System.out.print("Enter employee location: ");
            location = scanner.nextLine();
            if (location.trim().isEmpty()) {
                throw new IllegalArgumentException("Location cannot be empty");
            }

            
            System.out.print("Enter employee phone number: ");
            phoneNum = scanner.nextLong();
            if (!Pattern.matches("\\d{10}", Long.toString(phoneNum))) {
                throw new IllegalArgumentException("Invalid phone number. Must be a 10-digit number.");
            }

            
            System.out.print("Enter employee salary: ");
            salary = scanner.nextDouble();
            if (salary < 0) {
                throw new IllegalArgumentException("Salary must be a positive number");
            }

            
            scanner.nextLine();
            System.out.print("Enter employee email: ");
            email = scanner.nextLine();
            if (!Pattern.matches("[^@]+@[^@]+\\.[^@]+", email)) {
                throw new IllegalArgumentException("Invalid email address");
            }

            
            
            EmployeeExc employee = new EmployeeExc(name, empId, address, location, phoneNum, salary, email);
            System.out.println("Employee created successfully: " + employee.toString());
        }catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
        
        
}
}


