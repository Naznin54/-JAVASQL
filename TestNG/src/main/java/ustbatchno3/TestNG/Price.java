package ustbatchno3.TestNG;

public class Price {
	
		private String city;
		private int pricewithoutmaterial;
		private int pricewithmaterial;
		public Price(String city, int pricewithoutmaterial, int pricewithmaterial) {
			super();
			this.city = city;
			this.pricewithoutmaterial = pricewithoutmaterial;
			this.pricewithmaterial = pricewithmaterial;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getPricewithoutmaterial() {
			return pricewithoutmaterial;
		}
		public void setPricewithoutmaterial(int pricewithoutmaterial) {
			this.pricewithoutmaterial = pricewithoutmaterial;
		}
		public int getPricewithmaterial() {
			return pricewithmaterial;
		}
		public void setPricewithmaterial(int pricewithmaterial) {
			this.pricewithmaterial = pricewithmaterial;
		}
		@Override
		public String toString() {
			return "Price [city=" + city + ", pricewithoutmaterial=" + pricewithoutmaterial + ", pricewithmaterial="
					+ pricewithmaterial + "]";
		}
		
	}



