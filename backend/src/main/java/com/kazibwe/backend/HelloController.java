package com.kazibwe.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
    
}
