package com.example.springboot_jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {
     @GetMapping("/index")
     public String helloworld(){
         System.out.println("Hello World");
         return "index";
     }
}
