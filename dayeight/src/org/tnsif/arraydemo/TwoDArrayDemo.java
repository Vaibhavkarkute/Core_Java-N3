package org.tnsif.arraydemo;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		System.out.println("Enter the nu. of Indexed TO you Want :");
		Scanner s = new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int arr [][] = new int[n][m];
		System.out.println("Enter the Element of the array");
		for(int i=0;i<n;i++)
		{
			
			for(int j=0; j<m;j++)
			{	
			
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0; j<m;j++)
			{
				System.out.println(arr[i][j] + " ");
			}
		}System.out.println();
		
		

	}

}
