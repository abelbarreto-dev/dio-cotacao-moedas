package com.abel.dio_cotacao_moedas.controller;

import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import com.abel.dio_cotacao_moedas.service.IServiceDollarReal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usd-brl")
public class ControllerDollarReal {
    @Autowired
    private IServiceDollarReal serviceDollarReal;

    @GetMapping
    public ResponseEntity<Moeda> getDollarInReal() {
        return serviceDollarReal.getDollarInReal();
    }

    @PostMapping("/real-dollar")
    public ResponseEntity<Moeda> parseRealToDollar(@RequestBody Moeda moeda) {
        var cotacao = new MoedaCotacao("BRL-USD", moeda.getValor());

        return serviceDollarReal.parseRealToDollar(cotacao);
    }

    @PostMapping("/dollar-real")
    public ResponseEntity<Moeda> parseDollarToReal(@RequestBody Moeda moeda) {
        var cotacao = new MoedaCotacao("USD-BRL", moeda.getValor());

        return serviceDollarReal.parseDollarToReal(cotacao);
    }
}
