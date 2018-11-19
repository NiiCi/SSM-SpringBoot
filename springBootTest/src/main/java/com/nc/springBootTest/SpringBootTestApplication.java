package com.nc.springBootTest;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
		System.out.println(Integer.MIN_VALUE*2);
	}
}
