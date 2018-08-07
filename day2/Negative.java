package java_practise2;

import java.util.Scanner;

public class Negative {
	public static void main(String args[]) {
		
		int a[]=new int[5];
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the 5 digits");
		
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		
		
		
		for (int i=0;i<a.length;i++) {
			if(i%2==1) {
				a[i]=-a[i];
			}

			System.out.print(a[i] + " ");
			
		
		}


		}
	}
