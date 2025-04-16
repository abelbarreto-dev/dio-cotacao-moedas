package com.abel.dio_cotacao_moedas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Moeda {
    private BigDecimal valor;
}
