package com.abel.dio_cotacao_moedas.infra;

import com.abel.dio_cotacao_moedas.exception.MoedaException;
import com.abel.dio_cotacao_moedas.response.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class MoedaExceptionHandler {
    @ExceptionHandler(MoedaException.class)
    public static ResponseEntity<?> moedaExceptionHandler(MoedaException moedaException) {
        var errorResponse = errorResponse(moedaException);
        return ResponseEntity.status(moedaException.getStatusCode()).body(errorResponse);
    }

    private static ErrorResponse errorResponse(MoedaException moedaException) {
        return new ErrorResponse(moedaException.getStatusCode(), moedaException.getMessage(), Instant.now());
    }
}
