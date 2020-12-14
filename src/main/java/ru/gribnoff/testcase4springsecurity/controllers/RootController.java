package ru.gribnoff.testcase4springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
    @GetMapping({"/", "/home"})
    public String goHome(Model model) {
        return "homePage";
    }
}
