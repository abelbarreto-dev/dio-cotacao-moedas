package com.abel.dio_cotacao_moedas.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(auth ->
                auth
                        .requestMatchers(HttpMethod.GET,"/").permitAll()

                        .requestMatchers(HttpMethod.GET, "/api/usd-brl").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/usd-brl/real-dollar").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/usd-brl/dollar-real").permitAll()

                        .requestMatchers(HttpMethod.GET, "/api/eur-brl").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/eur-brl/real-euro").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/eur-brl/euro-real").permitAll()

                        .requestMatchers(HttpMethod.GET, "/api/gbp-brl").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/gbp-brl/real-libra").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/gbp-brl/libra-real").permitAll()

                        .anyRequest().authenticated()
        ).httpBasic(Customizer.withDefaults());

        return httpSecurity.build();
    }
}
