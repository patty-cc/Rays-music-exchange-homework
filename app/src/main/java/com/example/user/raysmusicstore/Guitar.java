package com.example.user.raysmusicstore;

/**
 * Created by user on 09/09/2017.
 */

public class Guitar extends Instrument implements Playable {

    int numberOfStrings;

    public Guitar( String brand, String colour, String family, int numberOfStrings){
        super(brand, colour, family);
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return ( "Strum Strum Strum" );
    }

    public int getStrings() {
        return numberOfStrings;
    }

}
