package ru.gribnoff.testcase4springsecurity.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.gribnoff.testcase4springsecurity.service.UserService;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final UserService userService;

    @GetMapping("/user_login")
    public String showLoginPage(Model model) {
//        model.addAttribute("login", new Login());
        return "loginPage";
    }
//
//    @PostMapping("/loginProcess")
//    public String loginProcess(Model model, @ModelAttribute Login login) throws UserNotFoundException, IncorrectPasswordException {
//        User user = userService.validateUser(login);
//        model.addAttribute("user", user);
//        return "profilePage";
//    }
}
