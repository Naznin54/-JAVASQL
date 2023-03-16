package sona;


	public class Employeedetail {
		private String name;
		private int age;
		private int numofyears;
		private double salary;
		public Employeedetail(String name, int age, int numofyears, double salary) {
			super();
			this.name = name;
			this.age = age;
			this.numofyears = numofyears;
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name =name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age =age;
		}
		public int getNumofyears() {
			return numofyears;
		}
		public void setNumofyears(int numofyears) {
			this.numofyears=numofyears;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary =salary;
		}
		@Override
		public String toString() {
			return "Employeedetail [name=" + name + ", age=" + age + ", numofyears=" + numofyears + ", salary=" + salary
					+ "]";
		}
		

	}
