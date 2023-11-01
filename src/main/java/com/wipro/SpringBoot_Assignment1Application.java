package com.wipro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBoot_Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot_Assignment1Application.class, args);
	}

    @Bean
    CommandLineRunner getCommandLineRunner(ApplicationContext ctx) {
        return args -> {
        	System.out.println("All beans are :");
            String[] beans = ctx.getBeanDefinitionNames();
            for (String bean :beans) {
                System.out.println(bean);
            }

        };
    }

}
