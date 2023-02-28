package org.tnsif.application;

import org.tnsif.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	public GSPrimeAcc(int accno, String accname, float charges, boolean isPrime) {
		super(accno, accname, charges, isPrime);
	
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + "]";
	}
	
	
	
	

}
