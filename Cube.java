/*.Write a Java program that reads in two floating-point 
numbers and tests whether they are the same up to 
three decimal places.*/
package pro1;
import java.util.Scanner;

	public class Cube {
		public static void main(String[] args){
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the number: ");
				int num = sc.nextInt();
				for(int i=1; i<=num; i++){
		  System.out.println("the cube of " + num + " is " + num*num*num);
				}
			}}}
	