package org.tnsif.threadlifecycle;

public class SoftSkill extends Thread{
	
	public void run()
	{
		System.out.println("Profressional Ethics");
	
		for(int i=1;i<=5; i++)
		{
		System.out.print(i + " ");
		}
	}
}
