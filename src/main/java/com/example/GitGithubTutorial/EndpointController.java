package com.example.GitGithubTutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointController {
    
    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/hello2")
    public String hello2(){
        return "Hello World 2";
    }
}
