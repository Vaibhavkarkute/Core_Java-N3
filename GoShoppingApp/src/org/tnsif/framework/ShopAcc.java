package org.tnsif.framework;

public abstract class ShopAcc {
	
	private int accno;
	private String accname;
	private float charges;
	
	//Getter And Setters
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	//Parameterized Constructor
	public ShopAcc(int accno, String accname, float charges) {
		super();
		this.accno = accno;
		this.accname = accname;
		this.charges = charges;
	}
	
	
	@Override
	public String toString() {
		return "ShopAcc [accno=" + accno + ", accname=" + accname + ", charges=" + charges + "]";
	}
	
	abstract void bookproduct(float charges);
	public void items(float charges)
	{
		System.out.println(charges);
	}
	
	
	
	
	

}
