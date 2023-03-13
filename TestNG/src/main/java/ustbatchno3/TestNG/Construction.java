package ustbatchno3.TestNG;

public class Construction {
	   String city;
	   int price_material;
	   int price_withoutmaterial;
	   
	public Construction(String city, int price_material, int price_withoutmaterial) {
		super();
		this.city = city;
		this.price_material = price_material;
		this.price_withoutmaterial = price_withoutmaterial;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPrice_material() {
		return price_material;
	}
	public void setPrice_material(int price_material) {
		this.price_material = price_material;
	}
	public int getPrice_withoutmaterial() {
		return price_withoutmaterial;
	}
	public void setPrice_withoutmaterial(int price_withoutmaterial) {
		this.price_withoutmaterial = price_withoutmaterial;
	}
	public int totalamount(int squarefeet)
	{
	    int amount1=squarefeet*price_material;
	    int amount2=squarefeet*price_withoutmaterial;
	    int totalamount;
		return totalamount=amount1+amount2;
	
	   
	}
}


