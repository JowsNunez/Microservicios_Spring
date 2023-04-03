package com.nunez.jose.micro_inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.nunez.jose.micro_inventario.entity"})
@ComponentScan(basePackages = {"com.nunez.jose.micro_inventario"})
@EnableJpaRepositories(basePackages = {"com.nunez.jose.micro_inventario.repository"})
@SpringBootApplication
public class MicroInventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroInventarioApplication.class, args);
	}

}
