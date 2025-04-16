package com.abel.dio_cotacao_moedas.facade;

import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import org.springframework.http.ResponseEntity;

public class Facade implements IFacade {
    @Override
    public ResponseEntity<Moeda> getDollarInReal() {
        return null;
    }

    @Override
    public ResponseEntity<Moeda> parseRealToDollar(MoedaCotacao moedaCotacao) {
        return null;
    }

    @Override
    public ResponseEntity<Moeda> parseDollarToReal(MoedaCotacao moedaCotacao) {
        return null;
    }

    @Override
    public ResponseEntity<Moeda> getEuroInReal() {
        return null;
    }

    @Override
    public ResponseEntity<Moeda> parseRealToEuro(MoedaCotacao moedaCotacao) {
        return null;
    }

    @Override
    public ResponseEntity<Moeda> parseEuroToReal(MoedaCotacao moedaCotacao) {
        return null;
    }

    @Override
    public ResponseEntity<Moeda> getLibraInReal() {
        return null;
    }

    @Override
    public ResponseEntity<Moeda> parseRealToLibra(MoedaCotacao moedaCotacao) {
        return null;
    }

    @Override
    public ResponseEntity<Moeda> parseLibraToReal(MoedaCotacao moedaCotacao) {
        return null;
    }
}
