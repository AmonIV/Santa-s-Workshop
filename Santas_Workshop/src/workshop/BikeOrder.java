package workshop;

public class BikeOrder implements Order {
	
	private ToyOrder board;
	
	public BikeOrder(ToyOrder board) {
		this.board = board;
	}

	@Override
	public void execute() {
		this.board.setToyType("Bike");
	}

}
