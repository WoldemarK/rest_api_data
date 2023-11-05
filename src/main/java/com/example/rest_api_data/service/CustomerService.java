package com.example.rest_api_data.service;

import com.example.rest_api_data.model.Customer;
import com.example.rest_api_data.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getAll() {
        log.info("IN CustomerRepository method {findAll} ");
        return customerRepository.findAll();
    }

    public Customer getById(Long id) {
        log.info("IN CustomerRepository method {findById} " + id);
        return customerRepository.findById(id).get();
    }


    public Customer create(Customer customer) {
        log.info("IN CustomerRepository method {save} " + customer);
        return customerRepository.save(customer);
    }

    public void delete(Long id) {
        log.info("IN CustomerRepository method {deleteById} " + id);
        customerRepository.deleteById(id);
    }
}
