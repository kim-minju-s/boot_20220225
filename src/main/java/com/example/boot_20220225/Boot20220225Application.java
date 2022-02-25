package com.example.boot_20220225;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// 임의로 만든 controller
@ComponentScan(basePackages = { "com.example.controller" })
public class Boot20220225Application {

	public static void main(String[] args) {

		SpringApplication.run(Boot20220225Application.class, args);
		System.out.println("hellㅕㅗㅕㅗo world");
	}

}
