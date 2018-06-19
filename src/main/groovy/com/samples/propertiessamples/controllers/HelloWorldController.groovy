package com.samples.propertiessamples.controllers

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class)
    private int counter

    @GetMapping("/greeting")
    public String getGreeting(@RequestParam(name = "name") final String name){
        String message = String.format("Hello %s, this is the %d time you call me!", name, counter++)
        LOGGER.info(message)

        return message
    }
}
