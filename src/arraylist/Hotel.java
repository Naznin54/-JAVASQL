package arraylist;

public class Hotel {
   
   String name;
   int budget;
   String location;
   public Hotel(String name, int budget, String location) {
	super();
	this.name = name;
	this.budget = budget;
	this.location = location;
}
   public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =name;
	}
	
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget =budget;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	     
   
}
