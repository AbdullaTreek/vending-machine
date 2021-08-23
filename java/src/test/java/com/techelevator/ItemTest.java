package com.techelevator;

import junit.framework.TestCase;
import org.junit.Test;

import java.math.BigDecimal;

public class ItemTest extends TestCase {
    @Test
    public void testItem() {
        Item test = new Chip("K1", "Chewy", new BigDecimal("1.00"), "Chip");

        String actualResult = test.getName();
        String expectedResult = "Chewy";
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testName() {
        Item test = new Chip("K1", "Chewy", new BigDecimal("1.00"), "Chip");

        String actualResult = test.getName();
        String expectedResult = "Chewy";
        assertEquals(expectedResult, actualResult);

    }

    @Test// this test should not apply since stock is not part of the constructor.
    public void testStock() {
        Item test = new Gum("K1", "Chewy", new BigDecimal("1.00"), "Gum");
        int expectedResult=5;
        int actualResult= test.getStock();
        assertEquals(expectedResult,actualResult);
    }

    // not testable for dispense item since once again the stock is not in the constructor


    @Test
    public void testgetPrice() {
        Item test = new Gum("K1", "Chewy", new BigDecimal("1.05"), "Gum");
        BigDecimal actualResult= test.getPrice();
        BigDecimal expectedResult= new BigDecimal("1.05");
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSlot() {
        Item test = new Gum("K1", "Chewy", new BigDecimal("1.00"), "Gum");
        String actualResult = test.getSlot();
        String expectedResult = "K1";
        assertEquals(expectedResult, actualResult);
    }
}
