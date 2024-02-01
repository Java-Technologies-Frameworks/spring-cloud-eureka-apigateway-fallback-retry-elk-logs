package com.jtf.cloud.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayApplication {

	Logger logger = LoggerFactory.getLogger(CloudGatewayApplication.class);
	public static void main(String[] args) {
		CloudGatewayApplication obj = new CloudGatewayApplication();
		obj.logMethod();
		SpringApplication.run(CloudGatewayApplication.class, args);
	}
	public void logMethod(){
		logger.info("API gateway received the request ...");
	}

}
