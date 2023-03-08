package feature;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Count {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Trivandrum","Ernakulam","Kollam","Trivandrum");
		List<String> count=names.stream().filter(p->Collections.frequency(names,p)>1)
				.collect(Collectors.toList());
		System.out.println(count);
}        
}
