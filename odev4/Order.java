package odev4;

public class Order implements OrderInterface{

	@Override
	public void buyGame(Customer customer, Game game) {
		// TODO Auto-generated method stub

		System.out.println(game.getName()+" Adlý Oyun "+customer.getId()+" ID'li kullanýcý tarafýndan satýn alýnmýþtýr.");
	}

}
