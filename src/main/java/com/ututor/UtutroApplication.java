package com.ututor;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class UtutroApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(UtutroApplication.class, args);
	}

}
