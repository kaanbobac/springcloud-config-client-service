package com.kaan.microservices.configclientservice.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
@ConfigurationProperties(prefix="config.client")
@Configuration
@Data
public class Config {	
	private int configValue1;
	private int configValue2;
}
