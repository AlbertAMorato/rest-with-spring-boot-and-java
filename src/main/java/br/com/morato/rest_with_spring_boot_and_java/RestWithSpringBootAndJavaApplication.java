package br.com.morato.rest_with_spring_boot_and_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class RestWithSpringBootAndJavaApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}
	public static void main(String[] args) {
		SpringApplication.run(RestWithSpringBootAndJavaApplication.class, args);
	}

}
