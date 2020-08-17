package com.github.adetiamarhadi.springcloudhystrixdatetimeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringCloudHystrixDatetimeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHystrixDatetimeServiceApplication.class, args);
	}

	@GetMapping(path = "/datetime")
	public String getDatetime() {
		return LocalDateTime.now().toString();
	}

}
