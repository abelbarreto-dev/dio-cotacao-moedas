package com.abel.dio_cotacao_moedas.core;

import com.abel.dio_cotacao_moedas.response.MoedaData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class AwesomeAPI {
    private static RestTemplate restTemplate = new RestTemplate();

    private static final String BASEURL = "https://economia.awesomeapi.com.br/json/last/";

    private AwesomeAPI() {}

    public static MoedaData getExchange(final String currency) {
        final String apiUrl = BASEURL.concat(currency);
        ObjectMapper mapper = new ObjectMapper();

        MoedaData moedaData = null;

        try {
            ResponseEntity<String> response = restTemplate.exchange(
                    apiUrl,
                    HttpMethod.GET,
                    null,
                    String.class
            );

            final String keyCurrency = currency.replace("-", "");

            if (!response.getStatusCode().is2xxSuccessful())
                throw new RuntimeException("problem with awesome api");

            TypeReference<Map<String, MoedaData>> typeReference = new TypeReference<Map<String, MoedaData>>() {};
            Map<String, MoedaData> cotacoesMap = mapper.readValue(response.getBody(), typeReference);

            moedaData = cotacoesMap.get(keyCurrency);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return moedaData;
    }
}
