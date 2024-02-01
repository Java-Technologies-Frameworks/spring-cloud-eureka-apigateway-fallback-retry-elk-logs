package com.jtf.serviceregistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	Logger logger = LoggerFactory.getLogger(ServiceRegistryApplication.class);
	public static void main(String[] args) {
		ServiceRegistryApplication obj = new ServiceRegistryApplication();
		obj.logmethod();
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

	public void logmethod(){
		logger.info("Eureka Service registry started on port 8761");
	}

}
