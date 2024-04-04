package com.example.security.security.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class MainController {

    @RequestMapping("user")
    public String User(){
        return "Hello, User";
    }

    @RequestMapping("admin")
    public String Admin(){
        return "Hello, Admin";
    }
}
