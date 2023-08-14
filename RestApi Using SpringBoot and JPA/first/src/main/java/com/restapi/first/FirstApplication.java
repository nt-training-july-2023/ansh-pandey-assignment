package com.restapi.first;

import com.restapi.first.Entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
		Employee e = new Employee();

		System.out.println(e.hashCode());
	}

}
