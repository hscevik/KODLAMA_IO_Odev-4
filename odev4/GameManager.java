package odev4;

public class GameManager implements GameInterface{
	
GameInterface gameInterface;

public GameManager(GameInterface gameInteface ) {
	this.gameInterface=gameInteface;	
}

public void add(Game game) {
	gameInterface.add(game);
}
public void update(Game game) {
	gameInterface.update(game);
}

public void delete(Game game) {
	gameInterface.delete(game);
	
}

}
