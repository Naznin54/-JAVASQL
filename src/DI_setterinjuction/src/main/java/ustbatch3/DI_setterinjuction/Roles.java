package ustbatch3.DI_setterinjuction;

public class Roles {
	private String Character;
	private String Responsibility;
	public String getCharacter() {
		return Character;
	}

	public void setCharacter(String Character) {
		this.Character = Character;
	}

	public String getResponsibility() {
		return Responsibility;
	}

	public void setResponsibility(String Responsibility) {
		this.Responsibility = Responsibility;
	}
	public void display()
	{
       System.out.println("My name is Naznin :"+Character + ","+ "My responsibility is:"+Responsibility);
   }
}