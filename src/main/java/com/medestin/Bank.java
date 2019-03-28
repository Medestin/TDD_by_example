package com.medestin;

public class Bank {

    Money reduce(Expression source, String to){
        return source.reduce(this, to);
    }

    int rate(String from, String to){
        return  (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
    }


    private class Pair {
        private String from, to;

        public Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }
    }
}
