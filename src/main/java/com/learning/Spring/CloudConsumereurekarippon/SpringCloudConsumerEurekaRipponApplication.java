package com.learning.Spring.CloudConsumereurekarippon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class SpringCloudConsumerEurekaRipponApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerEurekaRipponApplication.class, args);
	}

}
