package org.tnsif.application;

import org.tnsif.framework.NormalAcc;
import org.tnsif.framework.PrimeAcc;
import org.tnsif.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAcc(int Accno, String accname, float charges, boolean isPrime) {
		GSPrimeAcc p= new GSPrimeAcc(Accno,accname,charges,isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormalAcc(int Accno, String accname, float charges, float deliverycharges) {
		GSNormalAcc n = new GSNormalAcc(Accno,accname,charges,deliverycharges);
		return n;
	}

}
