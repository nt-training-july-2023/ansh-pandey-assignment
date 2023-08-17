package com.restapi.first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {
//	 private static final Logger log = LogManager.getLogger(FirstApplication.class);
	public static Logger log = LoggerFactory.getLogger(FirstApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);

	}

}
