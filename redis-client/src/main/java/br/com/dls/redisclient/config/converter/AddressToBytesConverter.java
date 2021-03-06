package br.com.dls.redisclient.config.converter;

import br.com.dls.redisclient.domain.Address;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.stereotype.Component;

@WritingConverter
@Component
public class AddressToBytesConverter implements Converter<Address, byte[]> {

    private final Jackson2JsonRedisSerializer<Address> serializer;

    public AddressToBytesConverter() {

        serializer = new Jackson2JsonRedisSerializer<Address>(Address.class);
        serializer.setObjectMapper(new ObjectMapper());
    }

    @Override
    public byte[] convert(Address value) {
        return serializer.serialize(value);
    }
}

