package ustbatchno3.junit5testcases;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class Countnames {
	public static void main(String[] args) {
	
    List<String> l1=Arrays.asList("aaa","bbb","aaa");
	long dupe=l1.stream().filter(name->name.equalsIgnoreCase("aaa")).count();
	System.out.println(dupe);

}
	
}
