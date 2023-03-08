package arr;

public class Posneg {
	public static void main(String[] args) 
	  {
	    int a[]= {4,-4,6,8,-9,0,4,-7,56};
	    int p=0;
	    int n=0;
	   
	    for(int i=0;i<9;i++) {
	    
	      if(a[i] >=0) 
	         p++;
	        
	      else
             n++;
	        
	    } 
	      
	      System.out.println("count of Positive Numbers:" +p);
	      System.out.println("count of Negative Numbers:"+n);
	      

}
}

