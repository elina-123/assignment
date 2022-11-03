package pro1;
//Write a Java program to find the index of an array element.
import java.util.Arrays;

//Write a Java program to find the index of an array element.

public class IndexArray {
	public static void main(String[] args) {

	 int[] numbers = {2,3,4,5,6,7}; 
   int element = 5; 
   int index ;
   index= 3;
	for(int i = 0; i < numbers.length; i++) {
       if(numbers[i] == element) {
           index = i;
           break;
       }} 
   System.out.println("Index of "+element+" is : "+index);
   }
}