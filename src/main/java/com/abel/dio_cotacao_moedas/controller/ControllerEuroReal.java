package com.abel.dio_cotacao_moedas.controller;

import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import com.abel.dio_cotacao_moedas.service.IServiceEuroReal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/eur-brl")
public class ControllerEuroReal {
    @Autowired
    private IServiceEuroReal serviceEuroReal;

    @GetMapping
    public ResponseEntity<Moeda> getEuroInReal() {
        return serviceEuroReal.getEuroInReal();
    }

    @PostMapping("/real-euro")
    public ResponseEntity<Moeda> parseRealToEuro(@RequestBody Moeda moeda) {
        var cotacao = new MoedaCotacao("BRL-EUR", moeda.getValor());

        return serviceEuroReal.parseRealToEuro(cotacao);
    }

    @PostMapping("/euro-real")
    public ResponseEntity<Moeda> parseEuroToReal(@RequestBody Moeda moeda) {
        var cotacao = new MoedaCotacao("EUR-BRL", moeda.getValor());

        return serviceEuroReal.parseEuroToReal(cotacao);
    }
}
