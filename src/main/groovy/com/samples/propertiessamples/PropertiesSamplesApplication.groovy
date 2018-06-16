package com.samples.propertiessamples

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class PropertiesSamplesApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesSamplesApplication.class);

	static void main(String[] args) {
		LOGGER.info("---Booting PropertiesSamplesApplication---")
		SpringApplication.run PropertiesSamplesApplication, args
	}
}
