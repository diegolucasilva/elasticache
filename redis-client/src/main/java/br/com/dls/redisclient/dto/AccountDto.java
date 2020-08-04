package br.com.dls.redisclient.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Data
public class AccountDto {
    private Long id;
    private String number;
    private int balance;
}

