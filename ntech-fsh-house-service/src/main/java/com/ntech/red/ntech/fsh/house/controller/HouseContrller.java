package com.ntech.red.ntech.fsh.house.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/house")
public class HouseContrller {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
}
