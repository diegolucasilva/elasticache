package br.com.dls.redisclient.controller;

import br.com.dls.redisclient.domain.Customer;
import br.com.dls.redisclient.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    
    private final CustomerService customerService;

    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return customerService.create(customer);
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") String id, @RequestParam Long accountId) {
        return customerService.find(id, accountId);
    }




}