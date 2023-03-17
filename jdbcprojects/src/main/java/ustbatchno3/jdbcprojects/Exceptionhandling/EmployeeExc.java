package Exceptionhandling;

	import java.util.Scanner;
	import java.util.regex.Pattern;

	public class EmployeeExc {
	    private String name;
	    private int empId;
	    private String address;
	    private String location;
	    private long phoneNum;
	    private double salary;
	    private String email;

	    public EmployeeExc(String name, int empId, String address, String location, long phoneNum, double salary, String email) {
	        this.name = name;
	        this.empId = empId;
	        this.address = address;
	        this.location = location;
	        this.phoneNum = phoneNum;
	        this.salary = salary;
	        this.email = email;
	    }
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public long getPhoneNum() {
			return phoneNum;
		}
		public void setPhoneNum(long phoneNum) {
			this.phoneNum = phoneNum;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "EmployeeExc [name=" + name + ", empId=" + empId + ", address=" + address + ", location=" + location
					+ ", phoneNum=" + phoneNum + ", salary=" + salary + ", email=" + email + "]";
		}
	    
		

		
	   
	}


	   




