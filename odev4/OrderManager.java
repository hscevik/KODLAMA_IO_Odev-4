package odev4;

public class OrderManager implements OrderInterface{
	
	OrderInterface orderInterface;
	
	public OrderManager(OrderInterface orderInterface) {
		this.orderInterface=orderInterface;
		
	}

	@Override
	public void buyGame(Customer customer, Game game) {
		orderInterface.buyGame(customer, game);		
	}
	

}
