package com.reactivestax.configuration;

import com.reactivestax.services.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value = {"com.reactivestax"})
public class DIConfiguration {


    @Bean
    @Qualifier("debitAccountService")
    public AccountService getDebitAccountService() {
        return new DebitAccountService();
    }

    @Bean
    @Qualifier("creditAccountService")
    public AccountService getCreditAccountService() {
        return new CreditAccountService();
    }

}
