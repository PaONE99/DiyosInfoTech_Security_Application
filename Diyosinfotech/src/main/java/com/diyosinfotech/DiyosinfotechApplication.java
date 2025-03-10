package com.diyosinfotech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@ConfigurationPropertiesScan 
@EnableJpaAuditing
@SpringBootApplication
public class DiyosinfotechApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DiyosinfotechApplication.class, args);
		System.out.println("Diyos Infotech Security Application Started");
	}

	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(DiyosinfotechApplication.class);
	    }
}
