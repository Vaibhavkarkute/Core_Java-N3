package org.tnsif.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of Element " + "in the Array");
		int n=s.nextInt();
		//array declaration
		
		int arr[]=new int[n];
		//to allocate the value to the array
		for (int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}

		System.out.println("Array Element are :");
		
		for (int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	//to sort an array elements
	/*
		Arrays.sort(arr);
		for(int i = 0;i<n; i++)
		{
			System.out.println(arr[i] +" ");
		}
		*/
		Arrays.sort(arr);
		
		System.out.println("\nSorted Element are :");
		
		for (int a1:arr)
		{
			System.out.println(a1);
		}
	}
	

}
