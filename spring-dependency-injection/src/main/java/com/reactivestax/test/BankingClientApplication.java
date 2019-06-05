package com.reactivestax.test;

import com.reactivestax.configuration.DIConfiguration;
import com.reactivestax.consumer.BankingApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankingClientApplication {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        BankingApplication bankApp = context.getBean(BankingApplication.class);
        bankApp.processTransaction(100.0,"Sam","John");
        context.close();

    }
}
