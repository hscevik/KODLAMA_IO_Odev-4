package odev4;

public class Order implements OrderInterface{

	@Override
	public void buyGame(Customer customer, Game game) {
		// TODO Auto-generated method stub

		System.out.println(game.getName()+" Adl� Oyun "+customer.getId()+" ID'li kullan�c� taraf�ndan sat�n al�nm��t�r.");
	}

}
