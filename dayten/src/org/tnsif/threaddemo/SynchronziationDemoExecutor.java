package org.tnsif.threaddemo;

public class SynchronziationDemoExecutor {

	public static void main(String[] args) {
		SynchronziationDemo d= new SynchronziationDemo();
		ThreadOne b=new ThreadOne(d);
		ThreadTwo c=new ThreadTwo(d);
		b.start();
		c.start();
	}

}
