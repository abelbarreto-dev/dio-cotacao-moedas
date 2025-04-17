package com.abel.dio_cotacao_moedas.bean;

import com.abel.dio_cotacao_moedas.model.Moeda;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean
    public Moeda moeda() {
        return new Moeda(null);
    }
}
