package org.tnsif.framework;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	private static final float deliverycharges=0.0f;
	
	//Constructor
	public PrimeAcc(int accno, String accname, float charges,boolean isPrime) {
		super(accno, accname, charges);
		
		this.isPrime=isPrime;
	}
	
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	public void bookproduct(float charges)
	{
		System.out.println("Acc No."+ this.getAccno()+" " +"Acc Name :"+ this.getAccname()+ " Delivery Charges: "+ this.getCharges()+this.deliverycharges );

	}

}
