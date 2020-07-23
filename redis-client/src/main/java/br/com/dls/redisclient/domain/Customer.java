package br.com.dls.redisclient.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@Data
@RedisHash("customer")
public class Customer {

    @Id
    private String id;
    private String name;
    private List<Account> accounts;

    //@Reference
    //private List<Account> accounts;

}
