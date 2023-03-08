package feature;
import java.io.*;
import java.util.*;
import java.util.stream.*;

import java.util.ArrayList;

public class Square {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		a.add(5);
		List<Integer> sq=a.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(sq);
		}

}
