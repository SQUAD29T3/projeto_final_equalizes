package com.exemplo.teste.empresa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpresaConfig {

	@Bean
	CommandLineRunner commandLineRunner(EmpresaRepository repository) {
		return args -> {
		};

	}
}
