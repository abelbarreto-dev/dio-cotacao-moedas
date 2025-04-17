package com.abel.dio_cotacao_moedas.bean;

import com.abel.dio_cotacao_moedas.model.Moeda;
import com.abel.dio_cotacao_moedas.response.ErrorResponse;
import com.abel.dio_cotacao_moedas.response.MoedaData;
import com.abel.dio_cotacao_moedas.response.MoedaResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean
    public Moeda moeda() {
        return new Moeda(null);
    }
}
