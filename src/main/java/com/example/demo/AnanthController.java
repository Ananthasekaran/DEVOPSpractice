package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnanthController {

   @GetMapping("/hello") 
   public String Hello() {
        return "Helloo, Ananth!";
   } 

   @GetMapping("/login") 
   public String home() {
        return "login";
   } 
    
}
