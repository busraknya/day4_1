package game.concretes;

import game.abstracts.CustomerService;
import game.entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void delete(Customer customer) {
		System.out.println("Silindi: " + customer.getFirstName());
		
	}

	@Override
	public void save(Customer customer) {
		System.out.println("Kaydedildi: " + customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Güncellendi: " + customer.getFirstName());
		
	}

}
