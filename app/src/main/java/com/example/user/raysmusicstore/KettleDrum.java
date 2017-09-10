package com.example.user.raysmusicstore;

/**
 * Created by user on 09/09/2017.
 */

public class KettleDrum extends Instrument implements Playable  {

     String skinType;

    public KettleDrum( String brand, String colour,String family, String skinType ){
        super(brand, colour, family);
        this.skinType = skinType;
    }

    public String play() {
        return ( "BOOM BOOM BOOM" );
    }

    public String getSkin() {
        return skinType;
    }
}
