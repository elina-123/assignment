package pro1;
// Write a Java program to copy an array by iterating the array
import java.util.Arrays; 
public class CopyanArray {
	
	 public static void main(String[] args) {
	   int[] my_array = {11,22,33,44,55,66,77,88,99};
	   int[] new_array = new int[10];     
	 
	   System.out.println("Source Array : "+Arrays.toString(my_array));     
	   
	   for(int i=0; i < my_array.length; i++) {
	    new_array[i] = my_array[i];
	}
	   System.out.println("New Array: "+Arrays.toString(new_array));
	 }
	 }

