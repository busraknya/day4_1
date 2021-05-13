package game.abstracts;

import game.entities.Customer;
import game.entities.Game;

public interface SaleService {

	void addToList(Game[] games, Customer customer);

}
