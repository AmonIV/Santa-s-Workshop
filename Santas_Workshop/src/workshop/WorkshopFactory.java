package workshop;

public abstract class WorkshopFactory {

	public abstract WorkshopProduct createProduct(String productName);
	
	public WorkshopProduct produceProduct(String productName) {
		WorkshopProduct product = createProduct(productName);
		product.prepare();
		return product;
	}
}