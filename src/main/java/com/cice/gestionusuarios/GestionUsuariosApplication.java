package com.cice.gestionusuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GestionUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionUsuariosApplication.class, args);
	}
}
