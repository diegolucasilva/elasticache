package br.com.dls.redisclient.service;

import br.com.dls.redisclient.domain.Customer;
import br.com.dls.redisclient.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer create(Customer customer) {
        return (Customer) customerRepository.save(customer);
    }

    public Customer find(String id, Long accountId){

        Optional<Customer> optCustomer = customerRepository.findById(id);
        if (optCustomer.isPresent())
            return optCustomer.get();
        else
            return customerRepository.findByAccountsId(accountId).orElseGet(Customer::new);

    }

}
