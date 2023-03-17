package linked;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;



public class Largest {

    public static void main(String[] args) {
        
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(3);

        
        int k = 1; 
        int kthLargest = list.stream()
                             .sorted(Comparator.reverseOrder())
                             .collect(Collectors.toList())
                             .get(k-1); 
        
        System.out.println("The " + k + "th largest number is " + kthLargest);
    }
}