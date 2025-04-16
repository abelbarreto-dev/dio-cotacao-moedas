package com.abel.dio_cotacao_moedas.controller;

import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import com.abel.dio_cotacao_moedas.singleton.SingFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gbp-brl")
public class ControllerLibraReal {
    @GetMapping
    public ResponseEntity<Moeda> getLibraInReal() {
        return SingFacade.getInstance().getLibraInReal();
    }

    @PostMapping("/real-libra")
    public ResponseEntity<Moeda> parseRealToLibra(@RequestBody Moeda moeda) {
        var cotacao = new MoedaCotacao("BRL-GBP", moeda.getValor());

        return SingFacade.getInstance().parseRealToLibra(cotacao);
    }

    @PostMapping("/libra-real")
    public ResponseEntity<Moeda> parseLibraToReal(@RequestBody Moeda moeda) {
        var cotacao = new MoedaCotacao("GBP-BRL", moeda.getValor());

        return SingFacade.getInstance().parseLibraToReal(cotacao);
    }
}
