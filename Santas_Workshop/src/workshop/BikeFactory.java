package workshop;

import java.util.Random;

public class BikeFactory extends WorkshopFactory {
	Random rand = new Random();

	@Override
	public WorkshopProduct createProduct(String productName) {
		if(productName == "Bike") {
			Bike bike = new Bike();
			bike.setQuality(rand.nextInt(10)+1);
			return bike;
		}
		if(productName == "Bmx_bike") {
			BmxBike bike = new BmxBike();
			bike.setQuality(rand.nextInt(10)+1);
			return bike;
		}
		System.out.println("Unknown bike product");
		return null;
	}

}
