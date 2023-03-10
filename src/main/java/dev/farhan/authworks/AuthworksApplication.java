package dev.farhan.authworks;

import dev.farhan.authworks.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class AuthworksApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthworksApplication.class, args);
	}

}
