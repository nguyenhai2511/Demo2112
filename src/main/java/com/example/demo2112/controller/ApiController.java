package com.example.demo2112.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApiController {

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public String api (){
        return "redirect:https://spring-azure-demo-main.azurewebsites.net:443/api/demo0612/triggers/manual/invoke?api-version=2020-05-01-preview&sp=%2Ftriggers%2Fmanual%2Frun&sv=1.0&sig=tr3gKybxFOImwgGXvYQ34AX6UBzRZYMOXbtrSweyNcg";
    }

}