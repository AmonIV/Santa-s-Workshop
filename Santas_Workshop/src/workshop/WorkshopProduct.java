package workshop;

public abstract class WorkshopProduct {
	
	private double quality;

	public double getQuality() {
		return quality;
	}

	public void setQuality(double quality) {
		this.quality = quality;
	}
	
	public abstract void prepare();

}
