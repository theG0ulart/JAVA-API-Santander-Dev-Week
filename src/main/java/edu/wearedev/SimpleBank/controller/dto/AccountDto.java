package edu.wearedev.SimpleBank.controller.dto;

import edu.wearedev.SimpleBank.entity.Account;

import java.math.BigDecimal;

public record AccountDto(Long id, String number, String agency, BigDecimal balance, BigDecimal limit) {

    public AccountDto(Account model) {
        this(model.getId(), model.getNumber(), model.getAccountAgency(), model.getAccountBalance(), model.getAccountLimit());
    }

    public Account toModel() {
        Account model = new Account();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setAccountAgency(this.agency);
        model.setAccountBalance(this.balance);
        model.setAccountLimit(this.limit);
        return model;
    }
}
