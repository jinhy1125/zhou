package com.jinhy.zhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author jinhy
 */
@SpringBootApplication
@EnableMongoRepositories
public class ZhouApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhouApplication.class, args);
    }

}
