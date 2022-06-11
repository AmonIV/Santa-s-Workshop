package workshop;

public class BmxBikeOrder implements Order {
	
	private ToyOrder board;
	
	public BmxBikeOrder(ToyOrder board) {
		this.board = board;
	}

	@Override
	public void execute() {
		this.board.setToyType("Bmx_bike");
	}

}
