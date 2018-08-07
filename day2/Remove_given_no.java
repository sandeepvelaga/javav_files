package java_practise2;

import java.util.Scanner;

public class Remove_given_no {
	public static void main(String args[]) {
		
		Integer a[]=new Integer[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digits");
		
		for(int i=0;i<6;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if (a[i]==a[j] && i!=j) {
					a[j]=null;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		
		
		
	}

}
