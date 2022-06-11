package workshop;

public class Santa {

	private static Santa instance;
	ToyOrder board = new ToyOrder();
	Order bikeOrder = new BikeOrder(board);
	Order bmxBikeOrder = new BmxBikeOrder(board);
	Order dollOrder = new DollOrder(board);
	OrderPen pen = new OrderPen();
	
	private Santa()
	{
		
	}
	
	public static Santa getInstance()
	{
		if(instance == null) {
			instance = new Santa();
		}
		
		return instance;
	}
	
	public MagicBoard getBoard()
	{
		return this.board;
	}
	
	public void orderBikes()
	{
		pen.setOrder(bikeOrder);
		pen.writeOnBoard();
	}
	
	public void orderDolls()
	{
		pen.setOrder(dollOrder);
		pen.writeOnBoard();
	}
	
	public void orderBmxBikes()
	{
		pen.setOrder(bmxBikeOrder);
		pen.writeOnBoard();
	}
	
	public void inspectToy(WorkshopProduct toy, String name)
	{
		if(toy.getQuality()>5)
		{
			System.out.println(name + "'s toy has been approved and put in the gift sack");
		}
		else
		{
			System.out.println(name + "'s toy has been rejected");
		}
		
	}
	
}
