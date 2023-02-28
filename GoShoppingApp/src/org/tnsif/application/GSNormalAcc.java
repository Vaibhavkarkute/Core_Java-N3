package org.tnsif.application;

import org.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accno, String accname, float charges, float deliverycharges) {
		super(accno, accname, charges, deliverycharges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + "]";
	}

}
