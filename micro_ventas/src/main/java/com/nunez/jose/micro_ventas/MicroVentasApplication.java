package com.nunez.jose.micro_ventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {"com.nunez.jose.micro_ventas.entity"})
@ComponentScan(basePackages = {"com.nunez.jose.micro_ventas"})
@EnableJpaRepositories(basePackages = {"com.nunez.jose.micro_ventas.repository"})
@SpringBootApplication
public class MicroVentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroVentasApplication.class, args);
	}

}
