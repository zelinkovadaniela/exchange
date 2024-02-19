package com.app.exchange.mapper;

import com.app.exchange.dto.ExchangeRateDto;
import com.app.exchange.entity.ExchangeRateJpa;
import org.mapstruct.Mapper;

@Mapper
public interface DomainExchangeRateMapper {

    ExchangeRateJpa map(final ExchangeRateDto exchangeRate);

    ExchangeRateDto map(final ExchangeRateJpa exchangeRateJpa);
}
