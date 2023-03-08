package feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main{
public static void main(String[] args) {  
    List<Product1> productsList = new ArrayList<Product1>();  
   
    productsList.add(new Product1(1,"HP Laptop",10000f));  
    productsList.add(new Product1(2,"Dell Laptop",30000f));  
    productsList.add(new Product1(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product1(4,"Sony Laptop",28000f));  
    productsList.add(new Product1(5,"Apple Laptop",90000f));  
    List<Float> productPriceList2 =productsList.stream()  
            .filter(p -> p.price >10000)
            .map(p->p.price)        
            .collect(Collectors.toList()); 
    System.out.println(productPriceList2);   
}  
}  