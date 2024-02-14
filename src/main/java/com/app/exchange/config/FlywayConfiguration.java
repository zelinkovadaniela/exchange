package com.app.exchange.config;

import org.springframework.boot.autoconfigure.flyway.FlywayConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayConfiguration {

    @Bean
    public FlywayConfigurationCustomizer customizer() {
        return configuration -> {
            configuration.baselineOnMigrate(false);
            configuration.outOfOrder(true);
            configuration.validateOnMigrate(true);
            configuration.table("schema_version");
            configuration.schemas("exchange");
        };
    }
}
