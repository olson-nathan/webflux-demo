package io.ztech.cloud.webfluxdemo.domain;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@Data
@Builder
public class Beer {
    @Id
    private String id;

    @Field
    private String name;

    @Field
    private float abv;

    @Field("brewery_id")
    private String brewery;

    @Field
    private String description;
}
