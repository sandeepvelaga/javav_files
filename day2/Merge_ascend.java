package java_practise2;

import java.util.Arrays;

public class Merge_ascend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {1,3,2,5};
		int n1=arr1.length;

		int arr2[]= {9,8,7,6};
		int n2=arr2.length;

		int arr3[] =new int[n1+n2];

		merge(arr1,arr2,n1,n2,arr3);

		System.out.println("new array after merging");

		Arrays.sort(arr3);
		
		for(int i=0;i<n1+n2;i++) {
			
			System.out.print(arr3[i] +" ");
		}
		
		

	}

	public static void merge(int arr1[],int arr2[],int n1,int n2,int arr3[]) {
		int i=0,j=0,k=0;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<arr2[j]) {
				arr3[k++]=arr1[i++];
			}

			else
			{
				arr3[k++]=arr1[j++];
			}
		}

		while(i<n1) {
			arr3[k++]=arr1[i++];
		}
		while(j<n2) {
			arr3[k++]=arr2[j++];
		}
	}

}
