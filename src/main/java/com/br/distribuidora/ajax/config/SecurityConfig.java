package com.br.distribuidora.ajax.config;

import com.br.distribuidora.ajax.authentication.filter.FilterToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableMethodSecurity

public class SecurityConfig {
    @Autowired
    private FilterToken filter;

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager() ;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/usuario/**").hasRole("USER")
                        .requestMatchers("/dados-carta/**").hasRole("USER")
                        .requestMatchers("/produto/**").hasRole("ADMIN")
                        .requestMatchers("/venda/**").hasRole("USER")
                        .requestMatchers("/auth/login").permitAll()
                        .requestMatchers("/v2/api-docs", "/swagger-resources/**", "/webjars/**", "/swagger-ui/**").permitAll()
                        .anyRequest().authenticated()

                );
        http.logout( out -> out
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))

                )
                .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
