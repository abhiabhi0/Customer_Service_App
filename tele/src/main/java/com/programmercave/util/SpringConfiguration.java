package com.programmercave.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.programmercave.service.CustomerServiceImpl;
import com.programmercave.repository.CustomerRepository;

@Configuration
public class SpringConfiguration {
	@Bean// customerRepository bean definition 
	public CustomerRepository customerRepository() {
		CustomerRepository customerRepository = new CustomerRepository();
		return customerRepository;
	}

	@Bean
	public CustomerServiceImpl customerService() 
	{
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		customerService.setCount(10);
		customerService.setCustomerRepository(customerRepository());
		return customerService;
	}
}
