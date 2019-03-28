package com.medestin;

public class Franc extends Money{
    private String currency = "CHF";

    public Franc(int amount){
        this.amount = amount;
    }

    Money times(int multiplier){
        return new Franc(amount*multiplier);
    }
}
