package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import ustbatchno3.junit5testcases.Testcountwords;

public class Testcountwords {
	
	@Test
	public void freqtest() {
		List<String> s = Arrays.asList("aaa","bbb","ccc");
		Map<String,Long> expected = new HashMap<String,Long>();
		expected.put("aaa", (long) 1);
		expected.put("bbb",(long) 1);
		expected.put("ccc",(long) 1);
		
		Map<String,Long> actual =Countwords.count(s);
		assertEquals(expected,actual);
	}
}
