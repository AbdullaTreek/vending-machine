package com.techelevator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Purchase  {

    private List<Item> purchases = new ArrayList<Item>();// used item reference to make list of purchase
    private BigDecimal balance= new BigDecimal("0.00");

    //getter

    public BigDecimal getBalance() {

        return balance;
    }

// not testable due to the balance being a local var?
    //feed money method that updates balance here
    public void feedMoneyPurchase(BigDecimal deposit) {

        balance = balance.add(deposit);

    }

// not testable due to the balance being a local var?
    //method for adding purchase which will update the balance
    public void addPurchase(Item choice) {// made need to update the total price elsewhere?

            //add purchase to the list
            purchases.add(choice);

            //update the remaining money
            BigDecimal purchasePrice = choice.getPrice();
            balance = balance.subtract(purchasePrice);

            //need to add log?
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter targetFormat = DateTimeFormatter.ofPattern("MM/dd/yyy hh:mm a");
            LogWriter logger = new LogWriter ("log.txt");
            logger.writeToFile(currentDateTime.format(targetFormat)+ " " + choice.getName() + " "
                    + choice.getSlot()+ "\\ $ " + balance.add(purchasePrice) + "\\ $ " + balance);

    }

// not testable due to the balance being a local var?
    public String toString(Item choice) {
        choice.getNoise();
        String str= "------------------------------\n";
        for (Item purchases: this.purchases){
            str += "Your order:"+ purchases.getName()+"\n";
            str += "------------------------------\n";
            str += "Total Price: $"+ purchases.getPrice()+ "\n";
            str += "------------------------------\n";
        }

        str += "Money Remaining: $" + balance;

        return str;
    }



}
