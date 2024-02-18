package com.app.exchange.service;

import com.app.exchange.dto.ExchangeRateDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ExchangeService {

    @Value("${exchange.api.url}")
    private String apiUrl;
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public List<ExchangeRateDto> getExchangeRates(final boolean usedb) {
        try {
            final var exchangeRates = getExchangeRatesJsonRest();
            log.info("Exchange rates: {}", exchangeRates);
            return exchangeRates;
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error while getting exchange rates", e);
        }
    }
    private List<ExchangeRateDto> getExchangeRatesJsonRest() throws JsonProcessingException {
        final var countries = restTemplate.getForObject(apiUrl, String.class);
        return objectMapper.readValue(countries, new TypeReference<List<ExchangeRateDto>>() {});
    }

}
