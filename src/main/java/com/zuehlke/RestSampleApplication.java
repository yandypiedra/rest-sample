package com.zuehlke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

//@PropertySources({@PropertySource(value = "classpath:application.properties")})
@SpringBootApplication
public class RestSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSampleApplication.class, args);
	}
}
