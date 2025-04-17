package com.abel.dio_cotacao_moedas.infra;

import com.abel.dio_cotacao_moedas.exception.JsonException;
import com.abel.dio_cotacao_moedas.response.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class JsonExceptionHandler {
    @ExceptionHandler(JsonException.class)
    public static ResponseEntity<?> jsonExceptionHandler(JsonException jsonException) {
        var errorResponse = errorResponse(jsonException);
        return ResponseEntity.status(500).body(errorResponse);
    }

    private static ErrorResponse errorResponse(JsonException jsonException) {
        return new ErrorResponse(500, jsonException.getMessage(), Instant.now());
    }
}
