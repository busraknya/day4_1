package game;

import java.rmi.RemoteException;

import game.adapters.MernisManagerAdapter;
import game.concretes.CustomerManager;
import game.concretes.GameManager;
import game.concretes.SaleManager;
import game.entities.Customer;
import game.entities.Game;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException{
		
		CustomerManager customer = new CustomerManager(new MernisManagerAdapter());
		Customer player1 = new Customer(1,"Player1", "Abc", 2001,  11111111111L);
		Customer player2 = new Customer(2, "PLayer2", "Def", 2001, 22222222222L);
		
		customer.delete(player2);
		customer.save(player1);
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game(1,"Game1",100);
		Game game2 = new Game(2,"Game2",45);
		Game game3 = new Game(3,"Game3",74);
		
		Game[] games = {game1 , game2, game3};
 		gameManager.delete(game3);
 		Game[] gamesAfter = {game1,game2};
 		gameManager.update(game1);
		
 		SaleManager salesManager = new SaleManager();
		salesManager.addToList(gamesAfter, player1);
		
	}

}
