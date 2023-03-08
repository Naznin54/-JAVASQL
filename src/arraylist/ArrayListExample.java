package arraylist;
import java.io.*;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        int a,b;
        for(int i=0;i<4;i++) {
        	for(int j=1;j<4;j++) {
        		if(arr.get(i)+arr.get(j)==25) {
        			System.out.println(arr.get(i)+"+"+arr.get(j)+" "+"="+25);
                    break;
        		  
        		    
        		}
        	
        		
        			
      }
	}
} 

}