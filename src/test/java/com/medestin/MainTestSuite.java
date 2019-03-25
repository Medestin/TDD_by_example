package com.medestin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTestSuite {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);

        assertEquals(10, five.amount);
    }
}
