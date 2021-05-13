package game.abstracts;

import game.entities.Game;

public interface GameService {

	void delete(Game game);
	void save(Game game);
	void update(Game game);

}
