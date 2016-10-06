package com.pathohub.springwork.services;

//import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootHelloworldApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootHelloworldApplication.class, args);
	  //ApplicationContext ctx = SpringApplication.run(SpringbootHelloworldApplication.class, args);
       /* System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
	}*/
	}
}
