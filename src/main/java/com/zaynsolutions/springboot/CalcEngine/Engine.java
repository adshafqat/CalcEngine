package com.zaynsolutions.springboot.CalcEngine;
import org.springframework.boot.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@RestController
@RequestMapping("/calcengine")
public class Engine extends SpringBootServletInitializer 
{
	
    @GetMapping
    String home() {
        return "This is a Calc Engine and its used to perform complex calculations! Adeel";
    }



    public static void main(String[] args) {
        SpringApplication.run(Engine.class, args);
    }
    
    

}
