package odev4;

public class CustomerManager implements CustomerInterface{

	private CustomerInterface customerInterface;
	
	public CustomerManager(CustomerInterface customerInterface) {
		this.customerInterface=customerInterface;
	}
	
	

	
	public void add(Customer customer) {
		
	customerInterface.add(customer);	
		
	
	}
	public void update(Customer customer) {
		

		customerInterface.update(customer);
		
	}
	public void delete(Customer customer) {
		
		customerInterface.delete(customer);
	}
	
	
}
