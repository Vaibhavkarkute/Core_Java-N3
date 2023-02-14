package org.tnsif.arraydemo;

public class Student {
	//Private Data Member
	private int rollno;
	private String Name;
	private float percentage;
	
	//Getter and Setter
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	//Parameterized Constructor
	public Student(int rollno, String name, float percentage) {
		super();
		this.rollno = rollno;
		Name = name;
		this.percentage = percentage;
	}
	//Default Constructor
	public Student() {
		super();
		
	}
	
	

	
	

}
