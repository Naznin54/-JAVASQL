package feature;

public class Employe {
	private int uid;
	private String name;
	
	
	 
		public Employe(int uid, String name) {
		
		this.uid = uid;
		this.name = name;
	}
		
		 public int Uid() {
				return uid;
			}
			public void setUid(int uid) {
				this.uid = uid;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}

			@Override
			public String toString() {
				return "Employe [uid=" + uid + ", name=" + name + "]";
			}
			
}
