package ru.gribnoff.testcase4springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                    .antMatchers("/profile").authenticated()
//                    .antMatchers("/user_login", "/registration").anonymous()
//                    .anyRequest().permitAll()
//                .and()
//                    .formLogin()
//                    .loginPage("/user_login")
//                    .loginProcessingUrl("/login")
//                    .defaultSuccessUrl("/profile")
//                    .failureUrl("/user_login?login_error=1")
//                    .permitAll()
        ;
    }
}
