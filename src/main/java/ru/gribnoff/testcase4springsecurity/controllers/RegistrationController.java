package ru.gribnoff.testcase4springsecurity.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gribnoff.testcase4springsecurity.persistence.entity.User;
import ru.gribnoff.testcase4springsecurity.service.UserService;

@Controller
@RequiredArgsConstructor
public class RegistrationController {
    private final UserService userService;

    @GetMapping("/registration")
    public String goToRegistration(Model model) {
        model.addAttribute("user", new User());
        return "registrationPage";
    }

    @PostMapping("/registerProcess")
    public String registerUser(Model model, @ModelAttribute User user) {
        userService.register(user);
        return "profilePage";
    }
}
