package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class GoldCoinCalculatorTest {
	@Test
	public void testofgoldcoins() {
		
		GoldCoinCalculator s= new GoldCoinCalculator();
		
		assertEquals("*****",s.findcoins(LocalDate.of(2023, 2, 14)));
		assertEquals("***",s.findcoins(LocalDate.of(2023, 4, 14)));
		
	}

}