package com.medestin;

import java.util.Hashtable;

public class Bank {
    private Hashtable rates = new Hashtable();

    void addRate(String from, String to, int rate){
        rates.put(new Pair(from, to), rate);
    }

    Money reduce(Expression source, String to){
        return source.reduce(this, to);
    }

    int rate(String from, String to){
        return (int) rates.get(new Pair(from, to));
    }


    private class Pair {
        private String from, to;

        public Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object o) {
            Pair pair = (Pair) o;
            return from.equals(pair.from) && to.equals(pair.to);
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }
}
