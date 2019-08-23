package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foobar.foo.repo.BarRepository;

@RestController
public class HelloWorldController {

	@Autowired
	BarRepository barRepository;

	@RequestMapping({ "/hello" })
	public String firstPage() {
		System.out.println(barRepository.getById(100));
		return "Hello World";
	}

}