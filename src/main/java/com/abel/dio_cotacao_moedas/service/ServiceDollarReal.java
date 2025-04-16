package com.abel.dio_cotacao_moedas.service;

import com.abel.dio_cotacao_moedas.core.AwesomeAPI;
import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ServiceDollarReal implements IServiceDollarReal {
    @Override
    public ResponseEntity<Moeda> getDollarInReal() {
        var taxa = AwesomeAPI.getExchange("USD-BRL");

        var cotacao = new BigDecimal(taxa.getBid());

        return ResponseEntity.ok().body(new Moeda(cotacao));
    }

    @Override
    public ResponseEntity<Moeda> parseRealToDollar(MoedaCotacao moedaCotacao) {
        var taxa = AwesomeAPI.getExchange("USD-BRL");

        var cotacao = new BigDecimal(taxa.getBid());

        var valorCalculado = cotacao.multiply(moedaCotacao.valor());

        return ResponseEntity.ok().body(new Moeda(valorCalculado));
    }

    @Override
    public ResponseEntity<Moeda> parseDollarToReal(MoedaCotacao moedaCotacao) {
        var taxa = AwesomeAPI.getExchange("USD-BRL");

        var cotacao = new BigDecimal(taxa.getBid());

        var valorCalculado = cotacao.multiply(moedaCotacao.valor());

        return ResponseEntity.ok().body(new Moeda(valorCalculado));
    }
}
