package com.techelevator;

import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GumTest extends TestCase {

    @Test
    public void testGum() {
        Item test = new Gum("K1", "Chewy", new BigDecimal("1.00"), "Gum");

        String actualResult = test.getName();
        String expectedResult = "Chewy";
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testGumNoise(){
        Item test = new Gum("K1", "Chewy", new BigDecimal("1.00"), "Gum");
        test.getNoise();
    }

}