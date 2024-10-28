package com.thullyoo.openfeign_teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenfeignTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenfeignTesteApplication.class, args);
	}

}
