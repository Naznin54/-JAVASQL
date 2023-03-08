package array;
import java.util.*;
public class Common {
	
public static void Find(int[] arr1,int[] arr2)
{

Set<Integer> set1 = new HashSet<>();
Set<Integer> set2 = new HashSet<>();


for (int i : arr1) {
    set1.add(i);
}

for (int i : arr2) {
set2.add(i);
}

set1.retainAll(set2);
System.out.println("Common elements- " + set1);
}


public static void main(String[] args)
{
int[] arr1= { 1,2,3,4,5,10,15,17,19,50};


int[] arr2 = { 100,4,20,30,10,15,1,50,33,7};


System.out.println("Array 1: "+ Arrays.toString(arr1));

System.out.println("Array 2: "+ Arrays.toString(arr2));
Find(arr1, arr2);
}
}