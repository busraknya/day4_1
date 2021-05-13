package game.concretes;

import game.abstracts.GameService;
import game.entities.Game;

public class GameManager implements GameService{

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi: "+game.getGameName());
		
	}

	@Override
	public void save(Game game) {
		System.out.println("Oyun kaydedildi: "+game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi: "+game.getGameName());
		
	}

}