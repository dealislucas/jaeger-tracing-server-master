package com.lucascosta.jaegertracingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiLucas {

	public static void main(String[] args) {
		SpringApplication.run(ApiLucas.class, args);
	}

	//docker -run --name jaeger-ui -p 16686 -p 6831:6831/udp jaegertracing/all-in-one:1.9

}
