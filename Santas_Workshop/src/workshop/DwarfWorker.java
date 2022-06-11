package workshop;

public class DwarfWorker implements Dwarf {

	private String name;
	private MagicBoard board;
	private WorkshopFactory bikeFactory = new BikeFactory();
	private WorkshopFactory dollFactory = new DollFactory();
	WorkshopProduct toy;

	public DwarfWorker(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.board == null) {
			System.out.println("No toy set");
			return;
		}
		String lastToy = this.board.getUpdate();
		System.out.println(this.name + " received: " + lastToy);
		if(lastToy == "Bike")
		{
			toy = bikeFactory.produceProduct(lastToy);
		}
		if(lastToy == "Doll")
		{
			toy = dollFactory.produceProduct(lastToy);
		}
	}

	@Override
	public void setToy(MagicBoard board) {
		this.board = board;
	}
	
	public WorkshopProduct showToy()
	{
		return toy;
	}
	
	public String getName()
	{
		return this.name;
	}
	

}
