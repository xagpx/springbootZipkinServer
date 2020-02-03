package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin2.server.internal.EnableZipkinServer;


@EnableZipkinServer
@SpringBootApplication
public class SpringbootZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootZipkinServerApplication.class, args);
	}

}
