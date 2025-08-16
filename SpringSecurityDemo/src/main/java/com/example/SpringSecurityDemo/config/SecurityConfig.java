package com.example.SpringSecurityDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    //creating custom securityFilterChain
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //Disabling CSRF and making the http stateless
        http.csrf(customiser->customiser.disable());
        //AUthenticate all requests
        http.authorizeHttpRequests(authorizeRequests -> authorizeRequests.anyRequest().authenticated());
        //web login form
        http.formLogin(Customizer.withDefaults());
        //http basic from other clients
        http.httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
