package workshop;

public class OrderPen {

	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void writeOnBoard() {
		if(this.order == null) {
			System.out.println("No order set");
			return;
		}
		this.order.execute();
	}
	
}