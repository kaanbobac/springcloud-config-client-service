package com.kaan.microservices.configclientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaan.microservices.configclientservice.pojo.Config;
import com.kaan.microservices.configclientservice.pojo.ResponseConfig;

@RestController
public class ClientController {
	@Autowired
	private Config config;
	@GetMapping("/getConfig")
	public ResponseEntity<ResponseConfig> getAllConfigValues() {
		return new ResponseEntity<>(new ResponseConfig(config.getConfigValue1(),config.getConfigValue2()),
				HttpStatus.OK);
	}
}
