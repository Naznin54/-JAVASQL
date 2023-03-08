package feature;
import java.io.*;
import java.util.*;
import java.util.stream.*;

import java.util.ArrayList;

public class City {
	public static void main(String[] args) {
		List<String> city=Arrays.asList("Trivandrum","Ernakulam","Kollam","Thrissur","thiruvalla");
		List<String> result=city.stream().filter(s->s.toLowerCase().startsWith("t")).collect(Collectors.toList());
 	    System.out.println(result);
	

}
}
