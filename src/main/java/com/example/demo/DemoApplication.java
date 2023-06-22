package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @RequestMapping
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @GetMapping
	// public String qqq() {
	// 	return "qqq";
	// }

	// @GetMapping("/q")
	// public String q() {
	// 	return "q";
	// }
}
