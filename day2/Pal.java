package java_practise2;

import java.util.Scanner;

public class Pal {
	  
	  public static void main(String[] args) { // TODO Auto-generated method stub
	 
		  String original, reverse = ""; // Objects of String class
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("check if it is a palindrome");
	      original = sc.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string isn't a palindrome.");
	 
	   }
	}
