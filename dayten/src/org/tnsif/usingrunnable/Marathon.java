package org.tnsif.usingrunnable;
//program to demonstrate on runnable interface fora thread
public class Marathon implements Runnable{
	
	private int speed;
	private String City;

	//Runnable Interface contact run() Method by Default
	@Override
	public void run() {
		System.out.println("Speed of a participant :" +speed +" The City is "+City);
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

}
