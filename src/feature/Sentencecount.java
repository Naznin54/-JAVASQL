package feature;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sentencecount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the sentence:");
		String s=sc.nextLine();
		String str[]=s.split("[\\,:;!.? ]");
		
		List<String> words=Arrays.stream(str)
				.filter(a->!a.isEmpty())
				.collect(Collectors.toList());
		
		List<String> uniwords=words.stream().map(a->a.toLowerCase())
				.distinct().sorted()
				.collect(Collectors.toList());	
		
		System.out.println("Number of words:" +words.size());
		System.out.println("NUM OF UNIQUE WORDS:"+uniwords.size());
		System.out.println(uniwords);
		
		

}
}
