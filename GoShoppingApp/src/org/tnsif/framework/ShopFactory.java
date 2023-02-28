package org.tnsif.framework;

public abstract class ShopFactory {
	public abstract PrimeAcc getNewPrimeAcc(int Accno, String accname, float charges , boolean isPrime);
	public abstract NormalAcc getNewNormalAcc(int Accno, String accname, float charges , float deliverycharges);
	

}
