package array;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int temp,r;
		int sum=0;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
		

	}

}
