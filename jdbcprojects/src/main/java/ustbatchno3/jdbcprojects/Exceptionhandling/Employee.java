package Exceptionhandling;

public class Employee {
	private int empId;
	private String name;
	private long phone;
	private String email;
    private String address;
    private String location;
    private double salary;
	public Employee(int empId, String name, long phone, String email, String address, String location, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.location = location;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	 public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
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
		
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", phone=" + phone + ", email=" + email
					+ ", address=" + address + ", location=" + location + ", salary=" + salary + "]";
		}
		
   

}
