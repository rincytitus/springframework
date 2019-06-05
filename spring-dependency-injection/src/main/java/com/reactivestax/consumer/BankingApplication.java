package com.reactivestax.consumer;

import com.reactivestax.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BankingApplication {

    private AccountService debitAccountService;

    private AccountService creditAccountService;




    //constructor based injection
    @Autowired
    public BankingApplication(@Qualifier(value = "debitAccountService") AccountService debitAccountService) {
        this.debitAccountService = debitAccountService;
    }


    //setter based injection
    @Autowired
    @Qualifier("creditAccountService")
    public void setCreditAccountService(AccountService creditAccountService) {
        this.creditAccountService = creditAccountService;
    }
    public AccountService getCreditAccountService() {
        return creditAccountService;
    }



    public void processTransaction(Double money, String sender, String recipient){
        debitAccountService.transferMoney(money, sender);
        creditAccountService.transferMoney(money,recipient);

    }
}
