package com.tpk.SpringSecurityConnectDB;

import com.tpk.SpringSecurityConnectDB.config.InitConfig;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AllArgsConstructor
@SpringBootApplication
public class SpringSecurityConnectDbApplication implements CommandLineRunner {

	private final InitConfig initConfig;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityConnectDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		initConfig.insertTableRole();
	}
}
