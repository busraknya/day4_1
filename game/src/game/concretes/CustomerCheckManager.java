package game.concretes;

import game.abstracts.CustomerCheckService;
import game.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println(customer.getFirstName()+" adl� kullan�c� tan�ml�.");
		return true;
	}

}
