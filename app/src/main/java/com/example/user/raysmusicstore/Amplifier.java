package com.example.user.raysmusicstore;

/**
 * Created by user on 10/09/2017.
 */

public class Amplifier implements Sellable {

    String type;
    double buyPrice;
    double sellPrice;

    public Amplifier( String type, double buyPrice, double sellPrice ){
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }

    public String getItemType() {
        return type;
    }

    public double getItemBuyPrice() {
        return buyPrice;
    }

    public double getItemSellPrice() {
        return sellPrice;
    }

}
