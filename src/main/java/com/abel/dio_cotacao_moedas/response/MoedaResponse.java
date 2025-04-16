package com.abel.dio_cotacao_moedas.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoedaResponse {
    private Map<String, MoedaData> cotacoes;

    public MoedaData getCotacao(String moeda) {
        return this.getCotacoes() != null ? this.getCotacoes().get(moeda.toUpperCase()) : null;
    }

    @Override
    public String toString() {
        return "MoedaResponse{" +
                "cotacoes=" + cotacoes +
                '}';
    }
}
