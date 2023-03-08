package feature;

public class Customer {
	
		int registerid;
		String name;
		long phoneno;
		String emailid;
		String location;
	
  public Customer(int registerid, String name, long phoneno, String emailid, String location) {
	super();
	this.registerid = registerid;
	this.name = name;
	this.phoneno = phoneno;
	this.emailid = emailid;
	this.location = location;
}
  public int getRegisterid() {
		return registerid;
	}
	public void setRegisteridd(int registerid) {
		this.registerid = registerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno =phoneno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid =emailid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location =location;
	}
	@Override
	public String toString() {
		return "Customer [registerid=" + registerid + ", name=" + name + ", phoneno=" + phoneno + ", emailid=" + emailid
				+ ", location=" + location + "]";
	}
	


}
