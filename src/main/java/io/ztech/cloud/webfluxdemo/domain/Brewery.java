package io.ztech.cloud.webfluxdemo.domain;

import com.couchbase.client.java.repository.annotation.Field;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@Data
@Builder
public class Brewery {
    @Field
    private String name;

    @Field
    private String city;

    @Field
    private String state;

    @Field
    private String code;

    @Field
    private String country;

    @Field
    private String description;
}
