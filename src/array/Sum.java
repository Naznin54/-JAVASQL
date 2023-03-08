package array;

import java.util.Scanner;

public class Sum {
	public static void Main (String[] args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of array:");
        int length=sc.nextInt();
        int[] n=new int[length];
        int[] cs=new int[length];
        int sum=0;
        System.out.println("Enter the elements:");
        for(int i=0;i<=length;i++)
        {
           n[i]=sc.nextInt();
           sum+=n[i];
           cs[i]=sum;
         }
        System.out.println("Result is:");
        for(int i=0;i<=length;i++)
     	   System.out.println("Sum is :" +cs[i]);


}
}


