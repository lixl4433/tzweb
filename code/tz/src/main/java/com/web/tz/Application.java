package com.web.tz;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Application {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
        Set<String> set = new HashSet<String>();
        set.add("classpath:spring-application.xml");
        set.add("classpath:spring-mvc.xml");
        app.setSources(set);
        app.run(args);
	}
	
	
}
