package workshop;

public class DollOrder implements Order {
	
	private ToyOrder board;
	
	public DollOrder(ToyOrder board) {
		this.board = board;
	}

	@Override
	public void execute() {
		this.board.setToyType("Doll");
	}

}
