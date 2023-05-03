package it.develhope.Environment.Variables2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

   @Autowired
    Environment environment;

   @Value("${Properties.welcomeMsg}")
   private String welcomeMsg;

   @GetMapping("/")
   public String getHello(){
       return  welcomeMsg;
   }

}
