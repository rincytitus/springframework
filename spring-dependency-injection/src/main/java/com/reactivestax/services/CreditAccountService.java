package com.reactivestax.services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditAccountService implements  AccountService{
    private final Logger logger = LoggerFactory.getLogger(CreditAccountService.class);
    public void transferMoney(Double amount, String accountHolder){
        logger.debug("a sum of {} has been credited into account {}",amount,accountHolder);



    }
}
