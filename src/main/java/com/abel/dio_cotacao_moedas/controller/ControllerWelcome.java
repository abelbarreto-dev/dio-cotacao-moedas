package com.abel.dio_cotacao_moedas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerWelcome {
    @GetMapping
    public String getMessage() {
        return "Hello! Welcome to this exchange API!";
    }
}
