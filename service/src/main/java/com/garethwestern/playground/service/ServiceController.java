package com.garethwestern.playground.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/")
public class ServiceController {

    @GetMapping("/findData")
    public String findData() {
        return "Don't panic!";
    }
}
