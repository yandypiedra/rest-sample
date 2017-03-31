package com.zuehlke.services;

import com.zuehlke.model.Customer;
import com.zuehlke.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yapi on 17.03.17.
 */

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Iterable<Customer> getAllCustomers(){
        return repository.findAll();
    }

    public Customer createCustomer(Customer customer){
        return repository.save(customer);
    }
}
