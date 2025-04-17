package com.abel.dio_cotacao_moedas.exception;

import com.fasterxml.jackson.core.JsonProcessingException;

public class JsonException extends JsonProcessingException {
    public JsonException(String message) {
        super(message);
    }
}
