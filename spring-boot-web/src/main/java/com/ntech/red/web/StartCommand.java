package com.ntech.red.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.ntech.red.web.utils.ServerPortUtils;

/**
 * 启动参数设置类
 * @author joiant
 *
 */
public class StartCommand {
	
	private final Logger logger = LoggerFactory.getLogger(StartCommand.class);
	
	public StartCommand(String[] args) {
		Boolean isServerPort = false;
		String serverPort = "";
		if(args != null) {
			for(String arg:args) {
				if(StringUtils.hasText(arg) && arg.startsWith("--server.port")) {
					isServerPort = true;
					serverPort = arg;
					break;
				}
			}
		}
		
		if(!isServerPort) {
			int port = ServerPortUtils.getAvailablePort();
			logger.info("current server.port=" + port);
			System.setProperty("server.port", String.valueOf(port));
		}else {
			logger.info("current server.port=" + serverPort.split("=")[1]);
			System.setProperty("server.port", serverPort.split("=")[1]);
		}
	
	}
}
