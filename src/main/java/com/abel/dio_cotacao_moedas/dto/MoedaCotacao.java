package com.abel.dio_cotacao_moedas.dto;

import java.math.BigDecimal;

public record MoedaCotacao(String moedaCotacao, BigDecimal valor) {
    public MoedaCotacao {
        if (moedaCotacao == null || !moedaCotacao.matches("^[A-Z]{3,4}_[A-Z]{3,4}$"))
            throw new RuntimeException("cotacao da moeda não corresponde ao padrão");

        if (valor.compareTo(new BigDecimal("0")) < 0)
            throw new RuntimeException("valor não pode ser negativo.");
    }
}
