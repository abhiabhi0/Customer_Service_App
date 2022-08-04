package com.programmercave.service;
import com.programmercave.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService{
	private int count;
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl()
	{}
	
	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository, int count) {
		this.customerRepository = customerRepository;
        this.count = count;
	}
    public String fetchCustomer() {
		return customerRepository.fetchCustomer(count);
	}
	public String createCustomer() {
		return customerRepository.createCustomer();
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
