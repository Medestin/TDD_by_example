package com.medestin;

public class Franc extends Money{

    public Franc(int amount, String currency){
        this.amount = amount;
        this.currency = "CHF";
    }

    Money times(int multiplier){
        return new Franc(amount*multiplier);
    }
}
