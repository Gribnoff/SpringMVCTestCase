package ru.gribnoff.testcase4springsecurity.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gribnoff.testcase4springsecurity.persistence.entity.Login;
import ru.gribnoff.testcase4springsecurity.persistence.entity.User;
import ru.gribnoff.testcase4springsecurity.service.UserService;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final UserService userService;

    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("login", new Login());
        return "loginPage";
    }

    @PostMapping("/loginProcess")
    public String loginProcess(Model model, @ModelAttribute Login login){
        User user = userService.validateUser(login);
        model.addAttribute("user", user);
        return "profilePage";
    }
}
