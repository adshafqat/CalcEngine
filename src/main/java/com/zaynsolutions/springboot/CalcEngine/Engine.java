package com.zaynsolutions.springboot.CalcEngine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calcengine")
public class Engine 
{
	
    @GetMapping
    String home() {
        return "This is a Calc Engine and its used to perform complex calculations!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Engine.class, args);
    }

}
