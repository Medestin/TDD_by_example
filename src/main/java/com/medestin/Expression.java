package com.medestin;

public interface Expression {

    Money reduce(Bank bank, String to);
}
