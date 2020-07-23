package br.com.dls.redisclient.domain;

import lombok.Data;
import org.springframework.data.redis.core.index.Indexed;

@Data
public class Account {
    @Indexed
    private Long id;
    private String number;
    private int balance;
}
