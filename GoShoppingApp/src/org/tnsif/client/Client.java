package org.tnsif.client;

import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.application.GSShopFactory;

public class Client {

	public static void main(String[] args) {
		GSShopFactory f= new GSShopFactory();
		GSPrimeAcc p = new GSPrimeAcc(123,"Vaibhav Karkute",1050f,true);
		GSNormalAcc n = new GSNormalAcc(123,"Pratik More",1050f,60f);
		
		//Prime Account
		System.out.println("Prime Acc");
		System.out.println(p);
		p.bookproduct(p.getCharges());
		
		//Normal Account
		System.out.println("Normal Acc");
		System.out.println(n);
		n.bookproduct(n.getCharges());
		

	}

}
