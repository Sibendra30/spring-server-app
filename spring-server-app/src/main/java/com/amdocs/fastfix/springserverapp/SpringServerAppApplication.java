package com.amdocs.fastfix.springserverapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class SpringServerAppApplication extends SpringBootServletInitializer{
	
	private static Class<SpringServerAppApplication> applicationClass = SpringServerAppApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(SpringServerAppApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("Loading Custom App...");
        return application.sources(applicationClass);
    }

	
	@RestController
	class GreetingController {

	    @RequestMapping("/hello/{name}")
	    String hello(@PathVariable String name) {
	        return "Hello, " + name + "!";
	    }
	}
}
