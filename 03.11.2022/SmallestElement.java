package pro1;
//Write a Java program to find the second smallest element in an array
import java.util.*;  
public class SmallestElement {
	  
	public static int getSecondSmallest(int[] a, int total){  
	Arrays.sort(a);  
	return a[1];  
	}  
	public static void main(String args[]){  
	int a[]={1,2,5,6,3,2};  
	int b[]={11,22,44,66,33,99};  
	System.out.println("Second Smallest: "+getSecondSmallest(a,6));  
	System.out.println("Second Smallest: "+getSecondSmallest(b,7));  
	}}  

