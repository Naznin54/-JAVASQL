/**
 * 
 */
package hashmap1;
import java.util.HashMap;


/**
 * @author Administrator
 *
 */
public class Hashmapeg {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        HashMap<String, Integer> map = new HashMap<>();
  
        
        map.put("vaibhav", 10);
        map.put("saritha", 30);
        map.put("Amala", 20);
  
       
        System.out.println("Size of map is:- " + map.size());
  
        System.out.println(map);
  
       
        if (map.containsKey("vaibhav")) {
  
            
            Integer a = map.get("vaibhav");
  
            
            System.out.println("value for key" + " \"vaibhav\" is:- " + a);
        }
    


	}
}


