package com.abel.dio_cotacao_moedas.service;

import com.abel.dio_cotacao_moedas.core.AwesomeAPI;
import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ServiceEuroReal implements IServiceEuroReal {
    @Override
    public ResponseEntity<Moeda> getEuroInReal() {
        var taxa = AwesomeAPI.getExchange("EUR-BRL");

        var cotacao = new BigDecimal(taxa.getBid());

        return ResponseEntity.ok().body(new Moeda(cotacao));
    }

    @Override
    public ResponseEntity<Moeda> parseRealToEuro(MoedaCotacao moedaCotacao) {
        var taxa = AwesomeAPI.getExchange("EUR-BRL");

        var cotacao = new BigDecimal(taxa.getBid());

        var valorCalculado = cotacao.multiply(moedaCotacao.valor());

        return ResponseEntity.ok().body(new Moeda(valorCalculado));
    }

    @Override
    public ResponseEntity<Moeda> parseEuroToReal(MoedaCotacao moedaCotacao) {
        var taxa = AwesomeAPI.getExchange("EUR-BRL");

        var cotacao = new BigDecimal(taxa.getBid());

        var valorCalculado = cotacao.multiply(moedaCotacao.valor());

        return ResponseEntity.ok().body(new Moeda(valorCalculado));
    }
}
