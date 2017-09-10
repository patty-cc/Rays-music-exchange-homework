package com.example.user.raysmusicstore;

/**
 * Created by user on 10/09/2017.
 */

public class GuitarPick implements Sellable {

    String type;
    double buyPrice;
    double sellPrice;

    public  GuitarPick( String type, double buyPrice, double sellPrice ){
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getItemType(){
        return type;
    }

    public double getBuyPrice(){
        return buyPrice;
    }

    public double getSellPrice(){
        return sellPrice;
    }

    public double calculateMarkup() {
        return 3.00;
    }
}
