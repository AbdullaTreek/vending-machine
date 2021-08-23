package com.techelevator;

import junit.framework.TestCase;
import org.junit.Test;

import java.math.BigDecimal;

public class CandyTest extends TestCase {

    @Test
    public void testCandy() {
        Candy test = new Candy("K1", "Chewy", new BigDecimal("1.00"), "Candy");

        String actualResult = test.getName();
        String expectedResult = "Chewy";
        assertEquals(expectedResult, actualResult);

        //not sure how to test for the noise

    }

    @Test
    public void testCandyNoise(){
        Item test = new Candy("K1", "Chewy", new BigDecimal("1.00"), "Candy");
        test.getNoise();
    }


}