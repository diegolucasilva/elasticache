package br.com.dls.redisclient.config.converter;

import br.com.dls.redisclient.domain.Address;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.stereotype.Component;

@ReadingConverter
@Component
public class BytesToAddressConverter implements Converter<byte[], Address> {

    private final Jackson2JsonRedisSerializer<Address> serializer;

    public BytesToAddressConverter() {

        serializer = new Jackson2JsonRedisSerializer<Address>(Address.class);
        serializer.setObjectMapper(new ObjectMapper());
    }

    @Override
    public Address convert(byte[] value) {
        return serializer.deserialize(value);
    }
}