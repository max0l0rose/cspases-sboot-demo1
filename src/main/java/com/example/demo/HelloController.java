package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping
public class HelloController {
	@GetMapping("/")
	public String root() {
		return "root14";
	}

	@GetMapping("/q")
	public String q() {
		return "q";
	}
}