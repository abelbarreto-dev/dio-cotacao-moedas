package com.abel.dio_cotacao_moedas.service;

import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import org.springframework.http.ResponseEntity;

public interface IServiceEuroReal {
    ResponseEntity<Moeda> getEuroInReal();
    ResponseEntity<Moeda> parseRealToEuro(MoedaCotacao moedaCotacao);
    ResponseEntity<Moeda> parseEuroToReal(MoedaCotacao moedaCotacao);
}
