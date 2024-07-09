package edu.wearedev.SimpleBank.controller.dto;

import edu.wearedev.SimpleBank.entity.Card;

import java.math.BigDecimal;

public record CardDto(Long id, String number, BigDecimal limit) {

    public CardDto(Card model) {
        this(model.getId(), model.getNumber(), model.getCardLimit());
    }

    public Card toModel() {
        Card model = new Card();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setCardLimit(this.limit);
        return model;
    }
}
