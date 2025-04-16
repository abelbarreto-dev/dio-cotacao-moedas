package com.abel.dio_cotacao_moedas.service;

import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import org.springframework.http.ResponseEntity;

public interface IServiceLibraReal {
    ResponseEntity<Moeda> getLibraInReal();
    ResponseEntity<Moeda> parseRealToLibra(MoedaCotacao moedaCotacao);
    ResponseEntity<Moeda> parseLibraToReal(MoedaCotacao moedaCotacao);
}
