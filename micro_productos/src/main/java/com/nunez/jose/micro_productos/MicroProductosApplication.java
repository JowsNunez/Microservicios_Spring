package com.nunez.jose.micro_productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.nunez.jose.micro_productos.entity"})
@EnableJpaRepositories(basePackages = {"com.nunez.jose.micro_productos.repository"})
@ComponentScan(basePackages = {"com.nunez.jose.micro_productos"})
@SpringBootApplication
public class MicroProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroProductosApplication.class, args);
	}

}
