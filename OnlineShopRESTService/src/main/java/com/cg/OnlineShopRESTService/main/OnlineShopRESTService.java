package com.cg.OnlineShopRESTService.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.cg.OnlineShopRESTService.bean")
@ComponentScan("com.cg.OnlineShopRESTService")
@EnableJpaRepositories("com.cg.OnlineShopRESTService")
@SpringBootApplication
public class OnlineShopRESTService {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopRESTService.class, args);
	}
}
