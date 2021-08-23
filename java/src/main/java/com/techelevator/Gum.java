package com.techelevator;

import java.math.BigDecimal;

public class Gum extends Item {


    public Gum(String slot, String name, BigDecimal price, String typeOfItem) {

        super(slot,name,price,typeOfItem);
    }

    public void getNoise(){
        System.out.println("Chew Chew, Yum!");
    }

}
