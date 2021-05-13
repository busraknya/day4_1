package game.abstracts;

import game.entities.Customer;

public interface CustomerService {
	
	void delete(Customer customer);
	void save(Customer customer);
	void update(Customer customer);

}
