package com.medestin;

public class Dollar extends Money {
    private String currency = "USD";

    public Dollar(int amount){
        this.amount = amount;
    }

    Money times(int multiplier){
        return new Dollar(amount*multiplier);
    }
}
