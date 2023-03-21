package ustbatch3.DI_constructorinjection;

public class Roles {
	
		private String character;
		private String responsibility;


        public Roles(String character, String responsibility) {
			super();
			this.character = character;
			this.responsibility = responsibility;
		}
       
       public void display()
		{
	       System.out.println("My name is:"+character + ","+ "My responsibility is:"+responsibility);
	   }
	}


