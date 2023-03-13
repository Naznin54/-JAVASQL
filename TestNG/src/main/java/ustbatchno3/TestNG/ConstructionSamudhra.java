package ustbatchno3.TestNG;


	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;

	public class ConstructionSamudhra {
			public static void main(String[] args){
				Price p1=new Price("Hyderabad", 2000, 900);
				Price p2=new Price("Chennai", 1800, 1000);
				Price p3=new Price("Thiruvananthapuram", 1600, 800);
				Price p4=new Price("Kochi", 1800, 1200);
				Price p5=new Price("Mumbai", 2500, 900);
				
				
				Scanner sc=new Scanner(System.in);
				
				List<Price> details=Arrays.asList(p1,p2,p3,p4,p5);
				System.out.println("Enter square feet");
				int sq=3,price=0;
				sq=sc.nextInt();
				System.out.println("Enter city");
				String city=sc.next();
				city.toLowerCase();
				int choice=0;
				System.out.println("Enter choice\n1-Price without material\n2-Price with material");
				choice=sc.nextInt();
				sc.close();
				price=construction(details, choice, city, sq);
				
				System.out.println("Total price : "+price);
				
			}
			public static int  construction(List<Price> details,int choice,String city,int sq) {
				List<Price> result=details.stream().filter(t->(t.getCity().equals(city))).toList();
				if(result.isEmpty()) {
					System.out.println("city not found!!!");
					
				}
				int price=0;
				switch(choice) {
				case 1:for(Price p:result) 
							price=(p.getPricewithoutmaterial()*sq);
							break;
				case 2:for(Price p:result) 
							price=(p.getPricewithmaterial()*sq);
							break;}
				return price;
			}
	}



