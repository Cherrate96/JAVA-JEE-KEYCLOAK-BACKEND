package com.home.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.keycloak.adapters.springsecurity.client.KeycloakClientRequestFactory;
import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakConfig {
	
	@Bean
	KeycloakSpringBootConfigResolver config()
	{
		return new KeycloakSpringBootConfigResolver();
	}
	
	@Bean
	KeycloakRestTemplate keycloakRestTemplate(KeycloakClientRequestFactory factory)
	{
		return new KeycloakRestTemplate(factory);
	}

}
