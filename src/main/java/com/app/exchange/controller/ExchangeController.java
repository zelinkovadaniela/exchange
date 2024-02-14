package com.app.exchange.controller;

import com.app.exchange.dto.ExchangeRateDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/exchange")
public class ExchangeController {

    @GetMapping
    public ResponseEntity<List<Object>> getExchangeRates(@RequestParam final boolean usedb) {
        try {
            return ResponseEntity.ok(List.of());
        } catch (RuntimeException e) {
            log.error("Error while getting exchange rates", e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
