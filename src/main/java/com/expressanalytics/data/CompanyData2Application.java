package com.expressanalytics.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.expressanalytics.data.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class CompanyData2Application {

	public static void main(String[] args) {
		SpringApplication.run(CompanyData2Application.class, args);
	}

}
