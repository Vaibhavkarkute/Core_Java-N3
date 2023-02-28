package org.tnsif.framework;

public abstract class NormalAcc extends ShopAcc
{
	final private float deliverycharges;
	
	public NormalAcc(int accno, String accname, float charges, float deliverycharges) 
	{
		super(accno, accname, charges);
		this.deliverycharges=deliverycharges;
		
	}
	

	@Override
	public String toString() 
	{
		return "NormalAcc [deliverycharges=" + deliverycharges + "]";
	}

	public void bookproduct(float charges)
	{
		System.out.println("Acc No."+ this.getAccno()+" " +"Acc Name :"+ this.getAccname()+ " "+  " Delivery Charges: "+ (charges+deliverycharges));

	}

	
	


	
	
	

}
