package arr;
import java.util.Scanner;

public class Luckynum {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.print("Input an number: ");
        int n=sc.nextInt();
        int dig;
        boolean is9pre=false,is6pre=false,is3pre=false;
          while(n>0)
          {
        	  dig=n%10;
        	  if(dig==9)
        		  is9pre=true;
        	  if(dig==6)
        		  is6pre=true;
        	  if(dig==3)
        		  is3pre=true;
        	  n/=10;
          }
          
        if(is9pre && is6pre && is3pre) 
                System.out.println("Lucky number");
        else 
        	   System.out.println("Not a lucky number");
        
          
        		  
        	  
   }
		
		
}


