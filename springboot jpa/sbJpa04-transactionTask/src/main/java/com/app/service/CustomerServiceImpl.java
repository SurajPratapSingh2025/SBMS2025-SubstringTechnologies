package com.app.service;

import org.springframework.stereotype.Service;

import com.app.model.Address;
import com.app.model.Contact;
import com.app.model.Customer;
import com.app.repository.AddressRepository;
import com.app.repository.ContactRepository;
import com.app.repository.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl {


	private AddressRepository addressrepo;
	private ContactRepository contactrepo;
	private CustomerRepository customerrepo;
	
	public CustomerServiceImpl(AddressRepository addressrepo,ContactRepository contactrepo,CustomerRepository customerrepo) {
		this.addressrepo=addressrepo;
		this.contactrepo=contactrepo;
		this.customerrepo=customerrepo;
	}
	// customer,address,contact
	
	@Transactional
	public String saveCustomer(String name,String city,String email) {
		Customer customer=new Customer();
		customer.setName(name);
		Customer c = customerrepo.save(customer);
		
	
		 
		Address address=new Address();
		address.setCustomerId(c.getId());
		address.setCity(city);
		addressrepo.save(address);
		
//		 	if (city.equalsIgnoreCase("error")) {
//	            throw new RuntimeException("City is invalid!");
//	        }
		 Contact contact = new Contact();
	        contact.setEmail(email);
	        contact.setCustomerId(c.getId());
		contactrepo.save(contact);
		
		return "All Stages saved SUCCESFULLY  !!!!!!!!!!!!!";
	}
	

}

