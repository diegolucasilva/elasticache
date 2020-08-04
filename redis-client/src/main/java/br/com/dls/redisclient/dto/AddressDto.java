package br.com.dls.redisclient.dto;

import lombok.Data;
import org.springframework.data.redis.core.index.Indexed;

@Data
public class AddressDto {

    private String city;
    private String  country;
    private String zipcode;
}
