package com.abel.dio_cotacao_moedas.controller;

import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import com.abel.dio_cotacao_moedas.service.IServiceLibraReal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gbp-brl")
public class ControllerLibraReal {
    @Autowired
    private IServiceLibraReal serviceLibraReal;

    @GetMapping
    public ResponseEntity<Moeda> getLibraInReal() {
        return serviceLibraReal.getLibraInReal();
    }

    @PostMapping("/real-libra")
    public ResponseEntity<Moeda> parseRealToLibra(@RequestBody Moeda moeda) {
        var cotacao = new MoedaCotacao("BRL-GBP", moeda.getValor());

        return serviceLibraReal.parseRealToLibra(cotacao);
    }

    @PostMapping("/libra-real")
    public ResponseEntity<Moeda> parseLibraToReal(@RequestBody Moeda moeda) {
        var cotacao = new MoedaCotacao("GBP-BRL", moeda.getValor());

        return serviceLibraReal.parseLibraToReal(cotacao);
    }
}
