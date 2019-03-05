package com.ntech.red.web.config;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class AsyncTaskExcutePool implements AsyncConfigurer {

	private final Logger logger = LoggerFactory.getLogger(AsyncTaskExcutePool.class);
	
	@Autowired
	private TaskThreadPoolConfig config;
	
	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor excutor = new ThreadPoolTaskExecutor();
		excutor.setCorePoolSize(config.getCorePoolSize());
		excutor.setMaxPoolSize(config.getMaxPoolSize());
		excutor.setQueueCapacity(config.getQueueCapacity());
		excutor.setKeepAliveSeconds(config.getKeepAliveSeconds());
		excutor.setThreadNamePrefix(config.getThreadNamePrefix());
		excutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
		excutor.initialize();
		return excutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		// TODO Auto-generated method stub
		return new AsyncUncaughtExceptionHandler() {
			
			@Override
			public void handleUncaughtException(Throwable arg0, Method arg1, Object... arg2) {
				// TODO Auto-generated method stub
				logger.error("===========" + arg0.getMessage() + "===========" ,arg0);
				logger.error("exception method:" + arg1.getName());
			}
		};
	}
	
}
