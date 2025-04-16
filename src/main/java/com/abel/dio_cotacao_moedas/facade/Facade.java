package com.abel.dio_cotacao_moedas.facade;

import com.abel.dio_cotacao_moedas.dto.MoedaCotacao;
import com.abel.dio_cotacao_moedas.model.Moeda;
import com.abel.dio_cotacao_moedas.service.*;
import org.springframework.http.ResponseEntity;

public class Facade implements IFacade {
    private final IServiceDollarReal serviceDollarReal = new ServiceDollarReal();

    private final IServiceEuroReal serviceEuroReal = new ServiceEuroReal();

    private final IServiceLibraReal serviceLibraReal = new ServiceLibraReal();

    @Override
    public ResponseEntity<Moeda> getDollarInReal() {
        return serviceDollarReal.getDollarInReal();
    }

    @Override
    public ResponseEntity<Moeda> parseRealToDollar(MoedaCotacao moedaCotacao) {
        return serviceDollarReal.parseRealToDollar(moedaCotacao);
    }

    @Override
    public ResponseEntity<Moeda> parseDollarToReal(MoedaCotacao moedaCotacao) {
        return serviceDollarReal.parseDollarToReal(moedaCotacao);
    }

    @Override
    public ResponseEntity<Moeda> getEuroInReal() {
        return serviceEuroReal.getEuroInReal();
    }

    @Override
    public ResponseEntity<Moeda> parseRealToEuro(MoedaCotacao moedaCotacao) {
        return serviceEuroReal.parseRealToEuro(moedaCotacao);
    }

    @Override
    public ResponseEntity<Moeda> parseEuroToReal(MoedaCotacao moedaCotacao) {
        return serviceEuroReal.parseEuroToReal(moedaCotacao);
    }

    @Override
    public ResponseEntity<Moeda> getLibraInReal() {
        return serviceLibraReal.getLibraInReal();
    }

    @Override
    public ResponseEntity<Moeda> parseRealToLibra(MoedaCotacao moedaCotacao) {
        return serviceLibraReal.parseRealToLibra(moedaCotacao);
    }

    @Override
    public ResponseEntity<Moeda> parseLibraToReal(MoedaCotacao moedaCotacao) {
        return serviceLibraReal.parseLibraToReal(moedaCotacao);
    }
}
