package com.reactivestax.services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebitAccountService implements AccountService{
    private final Logger logger = LoggerFactory.getLogger(DebitAccountService.class);
    public  void transferMoney(Double amount, String accountHolder){
    logger.debug("a sum of {} has been debited from {}",amount,accountHolder);

    }
}
