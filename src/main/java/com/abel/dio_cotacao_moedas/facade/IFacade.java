package com.abel.dio_cotacao_moedas.facade;

import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import org.springframework.http.ResponseEntity;

public interface IFacade {
    // real | dollar
    ResponseEntity<Moeda> getDollarInReal();
    ResponseEntity<Moeda> parseRealToDollar(MoedaCotacao moedaCotacao);
    ResponseEntity<Moeda> parseDollarToReal(MoedaCotacao moedaCotacao);

    // real | euro
    ResponseEntity<Moeda> getEuroInReal();
    ResponseEntity<Moeda> parseRealToEuro(MoedaCotacao moedaCotacao);
    ResponseEntity<Moeda> parseEuroToReal(MoedaCotacao moedaCotacao);

    // real | libra
    ResponseEntity<Moeda> getLibraInReal();
    ResponseEntity<Moeda> parseRealToLibra(MoedaCotacao moedaCotacao);
    ResponseEntity<Moeda> parseLibraToReal(MoedaCotacao moedaCotacao);
}
