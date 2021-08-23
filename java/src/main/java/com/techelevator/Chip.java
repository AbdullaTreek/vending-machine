package com.techelevator;

import java.math.BigDecimal;

public class Chip extends Item{

    public Chip(String slot, String name, BigDecimal price, String typeOfItem) {
        super(slot,name,price,typeOfItem);
    }

    public void getNoise(){
        System.out.println("Crunch Crunch, Yum!");
    }

}
