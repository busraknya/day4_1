package game.concretes;

import game.abstracts.CampaingService;
import game.entities.Campaing;

public class CampaingManager implements CampaingService {

	@Override
	public void delete(Campaing campaing) {
		System.out.println("Kampanya silindi:"+campaing.getCampaingName());
		
	}

	@Override
	public void save(Campaing campaing) {
		System.out.println("Kampanya kaydedildi:"+campaing.getCampaingName());
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println("Kampanya güncellendi:"+campaing.getCampaingName());
		
	}

}
