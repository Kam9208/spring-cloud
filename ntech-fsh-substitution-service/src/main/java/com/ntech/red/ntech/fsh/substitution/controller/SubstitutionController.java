package com.ntech.red.ntech.fsh.substitution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/substitution")
public class SubstitutionController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/callHello")
	public String callHello() {
		//不直接写固定地址，而是写服务的名称（spring.application.name）（fsh-house）
		return restTemplate.getForObject("http://fsh-house/house/hello", String.class);
	}
	
	
}
