package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.foobar.foo.repo.BarRepository;

@EnableAutoConfiguration
@ComponentScan({ "com.foobar", "com.foobar.foo.domain", "com.foobar.foo.repo" })
@SpringBootApplication
public class SpringBootPostgresApplication implements CommandLineRunner {

	@Autowired
	BarRepository barRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPostgresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(barRepository.getById(100));
		// return "Hello World";
	}
}
