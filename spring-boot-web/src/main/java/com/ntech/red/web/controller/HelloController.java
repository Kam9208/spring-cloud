package com.ntech.red.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntech.red.web.config.MyConfig;

@RestController
public class HelloController {

	//1.使用Environmentd读取配置
	//注入对象
	@Autowired
	private Environment env;
	
	
	//2.使用@Value读取配置
	//注入配置
	@Value("${server.port}")
	private String port;
	
	//3.自定义配置类
	@Autowired
	private MyConfig myConfig;
	
	@GetMapping("/hello")
	public String hello() throws Exception {
		//1.读取配置
//		String port = env.getProperty("server.port");
		throw new Exception("1222");
//		return myConfig.getName();
	}
}
