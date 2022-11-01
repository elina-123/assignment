/*write a java program to test if an array contains a specific value*/

package pro1;
public class Arraycontains1 {
	public static void main(String[] args) {

	    int[] num = {1, 2, 3, 4, 5};
	    int Find = 1;
	    boolean found = false;

	    for (int n : num) 
	    {
	      if (n == Find) 
	      {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(Find + " is found.");
	    else
	      System.out.println(Find + " is not found.");
	  }
	}
