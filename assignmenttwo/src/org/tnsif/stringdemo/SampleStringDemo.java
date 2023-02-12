package org.tnsif.stringdemo;
//program to demonstrate an example on string creation
import java.util.Scanner;

public class SampleStringDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		/*
		//using String Literal
		System.out.println("Enter  the First String : ");
		String str=s.nextLine();
		System.out.println("Enter  the First String : "+str);
		
		//Using new keyword 
		System.out.println("Enter the Second String : ");
		String str2=s.nextLine();
		System.out.println("Enter the Second String : "+str2);
		
		
		if(str.equals(str2))
		{
			System.out.println("Same String");
		
		}
		else
		{
			System.out.println("Different String");
		}
		
		*/
		char c[]= {'h','e','l','l','o'};
		String str3 = new String(c);
		System.out.println(str3);
		
;	}

}
