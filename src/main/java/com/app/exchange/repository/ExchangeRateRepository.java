package com.app.exchange.repository;

import com.app.exchange.entity.ExchangeRateJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRateJpa, Long> {
}
