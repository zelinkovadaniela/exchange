package com.app.exchange.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "exchange_rate")
public class ExchangeRateJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "short_name", nullable = false)
    private String shortName;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "valid_from", nullable = false)
    private LocalDateTime validFrom;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "move", nullable = false)
    private BigDecimal move;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "val_buy", nullable = false)
    private BigDecimal valBuy;

    @Column(name = "val_sell", nullable = false)
    private BigDecimal valSell;

    @Column(name = "val_mid", nullable = false)
    private BigDecimal valMid;

    @Column(name = "curr_buy", nullable = false)
    private BigDecimal currBuy;

    @Column(name = "curr_sell", nullable = false)
    private BigDecimal currSell;

    @Column(name = "curr_mid", nullable = false)
    private BigDecimal currMid;

    @Column(name = "version", nullable = false)
    private int version;

    @Column(name = "cnb_mid", nullable = false)
    private BigDecimal cnbMid;

    @Column(name = "ecb_mid", nullable = false)
    private BigDecimal ecbMid;

}
