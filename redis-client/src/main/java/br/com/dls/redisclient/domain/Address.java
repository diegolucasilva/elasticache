package br.com.dls.redisclient.domain;

import lombok.Data;
import org.springframework.data.redis.core.index.Indexed;

@Data
public class Address {

    private String city;
    @Indexed
    private String  country;
    private String zipcode;
}
