package ru.gribnoff.testcase4springsecurity.persistence.entity;

import lombok.Data;

@Data
public class Login {
    private String username;
    private String password;
}
