package com.medestin;

public class Bank {

    Money reduce(Expression source, String to){
        return source.reduce(this, to);
    }
}
