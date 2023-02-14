package org.tnsif.arraydemo;

import java.util.Scanner;

public class Jagged {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[][] =new int [2][];
		arr[0]= new int [3];
		arr[1]= new int[2];
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr.length;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0; i<arr[i].length; i++)
		{
			for(int j=0; j<arr[j].length;j++)
			{
				System.out.println(arr[i][j]+ " ");
			}
			
		}
		System.out.println(" ");

	}

}
