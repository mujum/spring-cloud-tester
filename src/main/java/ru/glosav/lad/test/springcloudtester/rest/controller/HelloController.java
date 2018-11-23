package ru.glosav.lad.test.springcloudtester.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("HelloController")
public class HelloController {

    @GetMapping("/Hello.html")
    public String helloController() {
        return "Hello over there";
    }
}
