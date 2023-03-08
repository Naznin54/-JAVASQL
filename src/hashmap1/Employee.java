package hashmap1;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String department;
	

	Employee(int id,String name, int age, String department) {
		super();
		this.id=id;
		this.name = name;
		this.age = age;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, department, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(department, other.department) && id == other.id
				&& Objects.equals(name, other.name);
	}
	
}