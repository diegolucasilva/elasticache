package br.com.dls.redisclient.dto;

import br.com.dls.redisclient.domain.Address;
import br.com.dls.redisclient.domain.Customer;
import br.com.dls.redisclient.dto.AddressDto;
import br.com.dls.redisclient.dto.CustomerDto;

public interface CustomerMapper {

    CustomerDto toCustomerDto(Customer customer);

    Customer toCustomer(CustomerDto customerDto);

    AddressDto toAddressDto(Address address);

    Address toAddress(AddressDto addressDto);
}
