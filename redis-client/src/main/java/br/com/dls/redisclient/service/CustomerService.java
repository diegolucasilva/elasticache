package br.com.dls.redisclient.service;

import br.com.dls.redisclient.domain.Customer;

public interface CustomerService {

    public Customer create(Customer customer);

    public Customer find(String id,String name, String country);
}

