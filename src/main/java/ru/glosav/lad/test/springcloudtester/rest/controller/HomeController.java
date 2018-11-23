package ru.glosav.lad.test.springcloudtester.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController("HomeController")
public class HomeController {

    @GetMapping("/")
    public RedirectView homeController() {
        return new RedirectView("/Hello.html");
    }
}