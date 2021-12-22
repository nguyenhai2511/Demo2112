package com.example.demo2112;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Demo2112Application {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    public static void main(String[] args) {
        SpringApplication.run(Demo2112Application.class, args);
    }

}
