package com.github.xipengyang.demo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.runtime.java.spring.CucumberGlueScopeConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * Created by davidyang on 1/03/17.
 */
@Import(CucumberGlueScopeConfiguration.class)
@EnableAutoConfiguration
public class ApplicationConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper;
    }
}
