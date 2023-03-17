package linked;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.*;

public class ListNode{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(10, 5, 8, 20, 4, 1, 7));
        int k = 3; 
        
        Optional<Integer> kthLargest = StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(linkedList.iterator(), Spliterator.ORDERED), false)
                .sorted(Comparator.reverseOrder())
                .skip(k-1)
                .findFirst();
        
        if(kthLargest.isPresent()) {
            System.out.println("The " + k + "th largest number is: " + kthLargest.get());
        } else {
            System.out.println("There is no " + k + "th largest number.");
        }
    }
}
