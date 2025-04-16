package com.abel.dio_cotacao_moedas.controller;

import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import com.abel.dio_cotacao_moedas.singleton.SingFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usd-brl")
public class ControllerDollarReal {
    @GetMapping
    public ResponseEntity<Moeda> getDollarInReal() {
        return SingFacade.getInstance().getDollarInReal();
    }

    @PostMapping("/real-dollar")
    public ResponseEntity<Moeda> parseRealToDollar(@RequestBody Moeda moeda) {
        var cotacao = new MoedaCotacao("BRL-USD", "USD-BRL", moeda.getValor());

        return SingFacade.getInstance().parseRealToDollar(cotacao);
    }

    @PostMapping("/dollar-real")
    public ResponseEntity<Moeda> parseDollarToReal(@RequestBody Moeda moeda) {
        var cotacao = new MoedaCotacao("USD-BRL", "BRL-USD", moeda.getValor());

        return SingFacade.getInstance().parseDollarToReal(cotacao);
    }
}
