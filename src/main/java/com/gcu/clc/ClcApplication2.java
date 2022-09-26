package com.gcu.clc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class ClcApplication2 extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(ClcApplication2.class);

    public static void main(String[] args) {

        logger.info("Info");
        logger.error("Error");
        logger.debug("debug");
        logger.trace("trace");
        logger.warn("warn");

        SpringApplication.run(ClcApplication2.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
            return builder.sources(ClcApplication2.class);
    }

}
