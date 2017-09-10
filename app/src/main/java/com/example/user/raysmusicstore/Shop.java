package com.example.user.raysmusicstore;

/**
 * Created by user on 10/09/2017.
 */
import java.util.ArrayList;

public class Shop {

    String shopName;
    ArrayList<Sellable> stock;


    public Shop( String shopName, String[]){
       this.shopName = shopName;
       this.stock = new ArrayList<>();
    }

    public String getShopName(){
        return shopName;
    }

}
