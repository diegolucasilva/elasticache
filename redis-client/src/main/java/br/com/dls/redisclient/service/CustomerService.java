package br.com.dls.redisclient.service;

import br.com.dls.redisclient.domain.Customer;
import br.com.dls.redisclient.repository.AccountRepository;
import br.com.dls.redisclient.repository.CustomerRepository;
import br.com.dls.redisclient.utils.CustomerNotFoundAdvice;
import br.com.dls.redisclient.utils.CustomerNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    private final AccountRepository accountRepository;

    public Customer create(Customer customer) {
        accountRepository.saveAll(customer.getAccounts());
        return (Customer) customerRepository.save(customer);
    }

    public Customer find(String id,String name, String country){

        Optional<Customer> optCustomer = customerRepository.findById(id);
        if (optCustomer.isPresent())
            return optCustomer.get();
        else
            return customerRepository.findByNameAndAddressCountry(name, country)
            .orElseThrow(() -> new CustomerNotFoundException(id));
    }

}
