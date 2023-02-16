package org.tnsif.threaddemo;

public class SynchronziationDemo {
	
	synchronized void print(int num)
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(num*i);
			
		}
	}
}
//Thread 1	
class ThreadOne extends Thread
{
		SynchronziationDemo d;
		

		public ThreadOne(SynchronziationDemo d)
		{
			super();
			this.d=d;
		}
		

		public void run()
		{
			d.print(10);
		}
}
	
	
//Thread 2
class ThreadTwo extends Thread
{
		SynchronziationDemo b;
		
		public ThreadTwo(SynchronziationDemo b) {
			super();
			this.b = b;
		}

		public void run()
		{
			b.print(15);
		}
}







