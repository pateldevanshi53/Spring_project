package com.example.hello_devanshi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {

@RequestMapping("/hello")

public String String () 
   {
    return "Hello_Devanshi";	
   }
	
}
