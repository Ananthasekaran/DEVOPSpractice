package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class AnanthController {

   @GetMapping("/hello") 
   public String Hello() {
        return "Helloo, Ananth!";
   } 
    
}
