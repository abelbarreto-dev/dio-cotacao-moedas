package com.abel.dio_cotacao_moedas.service;

import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import org.springframework.http.ResponseEntity;

public interface IServiceDollarReal {
    ResponseEntity<Moeda> getDollarInReal();
    ResponseEntity<Moeda> parseRealToDollar(MoedaCotacao moedaCotacao);
    ResponseEntity<Moeda> parseDollarToReal(MoedaCotacao moedaCotacao);
}
