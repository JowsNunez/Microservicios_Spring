package com.jose.nunez.micro_cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {"com.jose.nunez.micro_cliente.entity"})
@EnableJpaRepositories(basePackages = {"com.jose.nunez.micro_cliente.repository"})
@ComponentScan(basePackages = {"com.jose.nunez.micro_cliente"})
@SpringBootApplication
public class MicroClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroClienteApplication.class, args);
	}

}
