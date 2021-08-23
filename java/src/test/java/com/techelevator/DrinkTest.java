package com.techelevator;

import junit.framework.TestCase;
import org.junit.Test;

import java.math.BigDecimal;

public class DrinkTest extends TestCase {

    @Test
    public void testDrink() {
        Drink test = new Drink("K1", "Chewy", new BigDecimal("1.00"), "Drink");

        String actualResult = test.getName();
        String expectedResult = "Chewy";
        assertEquals(expectedResult, actualResult);

        //not sure how to test for the noise

    }

    @Test
    public void testDrinkNoise(){
        Item test = new Drink("K1", "Chewy", new BigDecimal("1.00"), "Drink");
        test.getNoise();
    }

}