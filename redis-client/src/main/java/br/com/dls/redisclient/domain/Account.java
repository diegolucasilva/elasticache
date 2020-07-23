package br.com.dls.redisclient.domain;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Data
//@RedisHash("account")
public class Account {
    @Indexed
    //@Id
    private Long id;
    private String number;
    private int balance;
}

