package com.zaynsolutions.springboot.CalcEngine;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class Engine 
{
	

    @RequestMapping("/engine")
    @ResponseBody
    String home() {
        return "This is a Calc Engine and its used to perform complex calculations!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Engine.class, args);
    }

}
