package org.tnsif.customerexception;

import java.util.Scanner;

public class CustomerExceptionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		s.nextLine();
		String password=s.nextLine();
		
		
		
		try
		{
			if(id.equals("vaibhav.karkute0072gmail.com") && password.equals("Vaibhav@123"))
			{
				System.out.println("Credential MAtched");
			}
			else
			{
				System.out.println("Invalid Credential");
			}
		}
		
		catch(LoginCredential e)
		{
			System.out.println("Exception Handled"+e);
		}
		finally
		{
			System.out.println("Fianlly Block");
		}

	}

}
