package com.abel.dio_cotacao_moedas.controller;

import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import com.abel.dio_cotacao_moedas.singleton.SingFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/eur-brl")
public class ControllerEuroReal {
    @GetMapping
    public ResponseEntity<Moeda> getEuroInReal() {
        return SingFacade.getInstance().getEuroInReal();
    }

    @PostMapping("/real-euro")
    public ResponseEntity<Moeda> parseRealToEuro(@RequestBody Moeda moeda) {
        var cotacao = new MoedaCotacao("BRL-EUR", "EUR-BRL", moeda.getValor());

        return SingFacade.getInstance().parseRealToEuro(cotacao);
    }

    @PostMapping("/euro-real")
    public ResponseEntity<Moeda> parseEuroToReal(@RequestBody Moeda moeda) {
        var cotacao = new MoedaCotacao("EUR-BRL", "BRL-EUR", moeda.getValor());

        return SingFacade.getInstance().parseEuroToReal(cotacao);
    }
}
