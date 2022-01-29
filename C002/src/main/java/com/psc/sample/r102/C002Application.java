package com.psc.sample.r102;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class C002Application {

    public static void main(String[] args) {
        SpringApplication.run(C002Application.class, args);
    }

}
