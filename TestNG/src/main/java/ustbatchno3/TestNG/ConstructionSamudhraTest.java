package ustbatchno3.TestNG;
import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;



import org.testng.annotations.Test;

public class ConstructionSamudhraTest {
	
	      @Test
	      public void Construction(){
	    	  int expected =2000;
	    	  
	    	  Price p1=new Price("Hyderabad", 2000, 900);
	    	  String city="Hyderabad";
	    	  List<Price> details=Arrays.asList(p1);
	    	  int ch=1,sq=1;
	    	  
	    	  assertEquals(expected, ConstructionSamudhra.construction(details, ch, city, sq));
	    	  ch=2;
	    	  
	    	  expected=900;
	    	  assertEquals(expected, ConstructionSamudhra.construction(details, ch, city, sq));
	    	  
	      }
	}


