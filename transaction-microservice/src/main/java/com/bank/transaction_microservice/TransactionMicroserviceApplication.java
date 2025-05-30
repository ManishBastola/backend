package com.bank.transaction_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TransactionMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionMicroserviceApplication.class, args);
	}

}
