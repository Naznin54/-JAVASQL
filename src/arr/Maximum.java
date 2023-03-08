/**
 * 
 */
package arr;

/**
 * @author Administrator
 *
 */
public class Maximum {
	public static void main(String[] args) {

	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub
		int[] arr= {5,3,8,1,7,2};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
		      if(arr[i]>max)
                 max=arr[i];
	     }
		 System.out.println("max num is:" +max);
		  
		}
}
