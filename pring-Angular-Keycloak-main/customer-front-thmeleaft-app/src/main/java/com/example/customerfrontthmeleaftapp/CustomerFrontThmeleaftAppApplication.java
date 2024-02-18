package com.example.customerfrontthmeleaftapp;

import com.example.customerfrontthmeleaftapp.entities.Customer;
import com.example.customerfrontthmeleaftapp.repos.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThmeleaftAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerFrontThmeleaftAppApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(Customer.builder().name("user1").email("uwjfw@eeeew.com").build());
			customerRepository.save(Customer.builder().name("user2").email("fjdu@lidnfd.com").build());
			customerRepository.save(Customer.builder().name("user3").email("fkddd@ghwuhw.com").build());
		};
	}

}
