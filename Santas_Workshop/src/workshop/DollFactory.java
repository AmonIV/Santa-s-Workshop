package workshop;

import java.util.Random;

public class DollFactory extends WorkshopFactory {

	Random rand = new Random();
	@Override
	public WorkshopProduct createProduct(String productName) {
		if(productName == "Doll") {
			Doll doll = new Doll();
			doll.setQuality(rand.nextInt(10)+1);
			return doll;
		}
		System.out.println("Unknown doll product");
		return null;
	}

}
