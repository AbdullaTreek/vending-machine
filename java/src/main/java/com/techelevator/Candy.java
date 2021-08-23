package com.techelevator;

import java.math.BigDecimal;

public class Candy extends Item{

    public Candy(String slot, String name, BigDecimal price, String itemType) {
        super(slot, name, price, itemType);
    }

    //to string

    public void getNoise(){
        System.out.println("Munch Munch, Yum!");
    }


}
