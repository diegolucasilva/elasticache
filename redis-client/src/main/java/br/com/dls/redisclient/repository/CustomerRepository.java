package br.com.dls.redisclient.repository;

import br.com.dls.redisclient.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>  {
}
