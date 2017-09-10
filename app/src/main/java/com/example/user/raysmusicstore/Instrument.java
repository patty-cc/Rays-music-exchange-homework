package com.example.user.raysmusicstore;

/**
 * Created by user on 09/09/2017.
 */

public abstract class Instrument {

    String brand;
    String colour;
    String family;


    public Instrument(String brand, String colour, String family) {
        this.brand = brand;
        this.colour = colour;
        this.family = family;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getColour(){
        return this.colour;
    }

    public String getFamily(){
        return this.family;
    }

}
