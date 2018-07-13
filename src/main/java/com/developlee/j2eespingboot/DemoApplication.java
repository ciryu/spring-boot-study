package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.mail.Quota;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Value("https://spring.io/blog/atom")
	Quota.Resource resource;

	@Bean(name = PollerMetadata.DEFAULT_POLLER)
    public PollerMetada poller(){
	    return Pollers.fixedRate(500).get();
    }

	@Bean


}
