package com.zuehlke.repositories;

import com.zuehlke.model.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by yapi on 17.03.17.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {}
