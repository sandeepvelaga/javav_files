package java_practise2;

import java.util.Scanner;

public class Palindrome {
	public static String findAllPalindromes(String input){
		int indexStart = 0;
		int wordMax = input.length();
		int wordLength;
		String checkPalindrome;
		String allPalindromes = "";
		for (wordLength = 2; wordLength <= wordMax; wordLength++) {

			//creates a substring to check against isAllPalindrome method
			checkPalindrome = input.substring(indexStart, wordLength);
			//checks checkPalindrome string to see if it is a palindrome
			if (isAllPalindrome(checkPalindrome) == true){
				allPalindromes += " " + checkPalindrome;
				if (checkPalindrome.length() >= allPalindromes.length()){
					allPalindromes = checkPalindrome;
				}
				
				
			}
			//once program reads string through once, increment index and scan text again
			if (wordLength == wordMax && indexStart < wordMax){
				indexStart++;
				wordLength = 0;
			}

		}
		System.out.println("The palindromes in the text are: ");
		System.out.println(allPalindromes);
		return allPalindromes;
	}
}