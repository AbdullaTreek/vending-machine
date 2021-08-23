package com.techelevator;

import java.math.BigDecimal;

public abstract class Item  {

    private String slot;
    private String name;
    private String itemType;
    private BigDecimal itemTotal= new BigDecimal("0.00");
    private BigDecimal price;
    private int stock=5;

    //constructor, does it need stock? How do i get the other classes not to need it?

    public Item(String slot, String name, BigDecimal price, String itemType) {
        this.slot= slot;
        this.name= name;
        this.price=price;
        this.itemType= itemType;
    }

    public String getName(){
        return name;
    }

    public String getSlot(){
        return slot;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void dispenseItem(){
        this.stock--;
    }

// For the item test it won't let me test since its an abstract class
    public abstract void getNoise();
}
