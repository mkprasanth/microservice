package com.in28minutes.microservices.netflixeurekanamingservernew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaNamingServerNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaNamingServerNewApplication.class, args);
	}

}
