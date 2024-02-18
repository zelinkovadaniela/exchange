package com.app.exchange.controller;

import com.app.exchange.dto.ExchangeRateDto;
import com.app.exchange.service.ExchangeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/exchange")
public class ExchangeController {

    private final ExchangeService exchangeService;

    @GetMapping
    public ResponseEntity<List<ExchangeRateDto>> getExchangeRates(@RequestParam(required = false) final boolean usedb) {
        try {
            return ResponseEntity.ok(exchangeService.getExchangeRates(usedb));
        } catch (RuntimeException e) {
            log.error("Error while getting exchange rates", e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
