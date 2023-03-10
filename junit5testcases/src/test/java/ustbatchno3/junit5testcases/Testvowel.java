
package ustbatchno3.junit5testcases;
import static org.junit.Assert.assertEquals;


import org.junit.Test;



/**
 * @author Administrator
 *
 */
public class Testvowel {
	
	@Test
	public void counttesting() {
		
		String input ="Naznin";
		
		int expected=2;
		int actual=Vowel.vowelscount(input);
		assertEquals(expected,actual);
		
	}
}
	
	 

	 

	 

	 

	