package com.ntech.red.ntech.fsh.house.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ntech.red.ntech.fsh.house.po.HouseInfo;

@RestController
@RequestMapping("/house")
public class HouseContrller {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/data")
	public HouseInfo getData(@RequestParam("name") String name) {
		return new HouseInfo(1L, "上海", "虹口", "东体小区");
	}
	
	@GetMapping("/data/{name}")
	public String getData2(@PathVariable("name") String name) {
		return name;
	}
}
