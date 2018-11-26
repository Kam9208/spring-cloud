package com.ntech.red.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//定义配置的前缀
@ConfigurationProperties(prefix="com.ntech")
@Configuration
public class MyConfig {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
