package com.boco.hubei.solution.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HubeiSolutionEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HubeiSolutionEurekaServerApplication.class, args);
	}
}
