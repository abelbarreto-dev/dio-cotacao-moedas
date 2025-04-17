package com.abel.dio_cotacao_moedas.dto;

import com.abel.dio_cotacao_moedas.exception.MoedaException;

import java.math.BigDecimal;

public record MoedaCotacao(String moedaCotacao, BigDecimal valor) {
    public MoedaCotacao {
        if (moedaCotacao == null || !moedaCotacao.matches("^[A-Z]{3,4}-[A-Z]{3,4}$"))
            throw new MoedaException("cotacao da moeda não corresponde ao padrão", 400);

        if (valor.compareTo(new BigDecimal("0")) < 0)
            throw new MoedaException("valor não pode ser negativo.", 400);
    }
}
