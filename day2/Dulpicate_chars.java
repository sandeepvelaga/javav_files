package java_practise2;

import java.util.Scanner;

public class Dulpicate_chars {
	public static void main(String args[] ){

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String s=sc.next();
		
		char c[]=s.toCharArray();
		
		
		for(int i=0;i<c.length;i++) {
			for(int j=i;j<c.length;j++) {
				if (c[i]==c[j] && i!=j) {
					c[j]=0;
				}
			}
			System.out.print(c[i]);
			
		}
	}


}
