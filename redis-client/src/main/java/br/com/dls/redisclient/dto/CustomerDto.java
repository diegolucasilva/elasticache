package br.com.dls.redisclient.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.List;

@Data
public class CustomerDto {

    private String id;
    private String name;
    private List<AccountDto> accounts;
    private AddressDto address;

}
