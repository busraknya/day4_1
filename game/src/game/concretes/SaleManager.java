package game.concretes;

import game.abstracts.SaleService;
import game.entities.Customer;
import game.entities.Game;

public class SaleManager implements SaleService {

	@Override
	public void addToList(Game[] games, Customer customer) {
		for (Game game : games) {
			System.out.println(game.getGameName()+ " alýþveriþ sepetine "+game.getGamePrice()+ " TL'ye eklenmiþtir.");
		}
		
	}
	


}
