package com.app.exchange.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Value
public class ExchangeRateDto {
    @NonNull
    String shortName;
    @NonNull
    LocalDateTime validFrom;
    @NonNull
    String name;
    @NonNull
    String country;
    @NonNull
    BigDecimal move;
    @NonNull
    BigDecimal amount;
    @NonNull
    BigDecimal valBuy;
    @NonNull
    BigDecimal valSell;
    @NonNull
    BigDecimal valMid;
    @NonNull
    BigDecimal currBuy;
    @NonNull
    BigDecimal currSell;
    @NonNull
    BigDecimal currMid;
    @NonNull
    int version;
    @NonNull
    BigDecimal cnbMid;
    @NonNull
    BigDecimal ecbMid;
}
