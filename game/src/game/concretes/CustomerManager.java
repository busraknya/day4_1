package game.concretes;

import game.abstracts.CustomerCheckService;

import game.entities.Customer;

public class CustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void delete(Customer customer) {
		super.delete(customer);
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer))
		{
			super.save(customer);
			System.out.println("Kullanýcý tanýmlý.");
		}
		else
		{
			System.out.println("Kullanýcý tanýmsýz.");
		}
		
	}

	@Override
	public void update(Customer customer) {
		super.update(customer);
	}
	

}