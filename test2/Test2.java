package com.{{test2}}.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class {{#capitalize}}{{test2}}{{/capitalize}}Application {

    public static void main(String[] args) {
        SpringApplication.run({{test2}}Application.class, args);
    }

}
