package com.chrisimoni.springbatchprj.config;

import com.chrisimoni.springbatchprj.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        //to filter by customers from United states
//        if(customer.getCountry().equals("United States")) {
//            return customer;
//        }else{
//            return null;
//        }

        return customer;
    }
}