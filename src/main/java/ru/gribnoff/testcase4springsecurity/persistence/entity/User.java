package ru.gribnoff.testcase4springsecurity.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NonNull
    private String username;
    @NonNull
    private String password;
    @NonNull
    private double balance;
    private String authority;
}
