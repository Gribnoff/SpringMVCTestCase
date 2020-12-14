package ru.gribnoff.testcase4springsecurity.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.gribnoff.testcase4springsecurity.exceptions.IncorrectPasswordException;
import ru.gribnoff.testcase4springsecurity.exceptions.InternalServerException;
import ru.gribnoff.testcase4springsecurity.exceptions.UserExistsException;
import ru.gribnoff.testcase4springsecurity.exceptions.UserNotFoundException;

@ControllerAdvice
public class ExceptionHandlerAdvice {
    private final String ERROR_VIEW = "error";

    @ExceptionHandler({UserNotFoundException.class, UserExistsException.class,
            IncorrectPasswordException.class, InternalServerException.class})
    public String handleException(final UserNotFoundException e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        model.addAttribute("innerCode", e.getErrorCode());

        return ERROR_VIEW;
    }
}
