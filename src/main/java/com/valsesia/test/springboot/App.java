package com.valsesia.test.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */


@RestController
@EnableAutoConfiguration
public class App 
{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/")
    String home() {
        logger.debug("Hello World!");
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

}
