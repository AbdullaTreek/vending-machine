package com.techelevator;

import junit.framework.TestCase;
import org.junit.Test;

import java.math.BigDecimal;

public class ChipTest extends TestCase {

    @Test
    public void testChip() {
        Chip test = new Chip("K1", "Chewy", new BigDecimal("1.00"), "Chip");

        String actualResult = test.getName();
        String expectedResult = "Chewy";
        assertEquals(expectedResult, actualResult);

        //not sure how to test for the noise

    }

    @Test
    public void testChipNoise(){
        Item test = new Chip("K1", "Chewy", new BigDecimal("1.00"), "Chip");
        test.getNoise();
    }

}