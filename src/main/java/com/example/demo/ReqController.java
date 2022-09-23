package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReqController {

    @GetMapping("/user")
    public String getUser() {
        return "User page";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Admin page";
    }
}
