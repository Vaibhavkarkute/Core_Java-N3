package org.tnsif.threaddemo;

public class ThreadExecutor {

	public static void main(String[] args) {
		SimpleThreadProgram p=new SimpleThreadProgram();
		p.setName("Java Thread");
		p.setPriority(8);
		
		//When Thread call to start method, it will come to run method
		p.start();
		p.run();
		//p.start();                  ----------------once we call the Start method again we cant call the restart
		System.out.println("Current Thread "+p);
	}

}
