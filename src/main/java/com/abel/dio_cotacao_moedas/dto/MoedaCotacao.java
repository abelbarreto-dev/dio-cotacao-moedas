package com.abel.dio_cotacao_moedas.dto;

import java.math.BigDecimal;

public record MoedaCotacao(String moedaOrigial, String moedaDestino, BigDecimal valor) {
    public MoedaCotacao {
        if (moedaOrigial == null || !moedaOrigial.matches("^[A-Z]{3,4}_[A-Z]{3,4}$"))
            throw new RuntimeException("moeda original não corresponde ao padrão");

        if (moedaDestino == null || !moedaDestino.matches("^[A-Z]{3,4}_[A-Z]{3,4}$"))
            throw new RuntimeException("moeda original não corresponde ao padrão");

        if (valor.compareTo(new BigDecimal("0")) < 0)
            throw new RuntimeException("valor não pode ser negativo.");
    }
}
