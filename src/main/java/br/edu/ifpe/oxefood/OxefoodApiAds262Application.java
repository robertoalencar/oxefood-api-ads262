package br.edu.ifpe.oxefood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OxefoodApiAds262Application {

	public static void main(String[] args) {
		SpringApplication.run(OxefoodApiAds262Application.class, args);
	}

}
