package com.abel.dio_cotacao_moedas.exception;

import lombok.Getter;

@Getter
public class MoedaException extends RuntimeException {
    private final int statusCode;

    public MoedaException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }
}
