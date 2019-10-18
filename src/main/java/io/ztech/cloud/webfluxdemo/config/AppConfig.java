package io.ztech.cloud.webfluxdemo.config;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractReactiveCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;

@Configuration
@EnableReactiveCouchbaseRepositories
public class AppConfig extends AbstractReactiveCouchbaseConfiguration {
    @Override
    protected List<String> getBootstrapHosts() {
        return Collections.singletonList("http://127.0.0.1");
    }

    @Override
    protected String getBucketName() {
        return "beer-sample";
    }

    @Override
    protected String getBucketPassword() {
        return "administrator";
    }

    @Override
    protected String getUsername() {
        return "admin";
    }

}
